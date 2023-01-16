package edu.java.ojdbc.view;

import static edu.java.ojdbc.model.Blog.Entity.*;
import static edu.java.ojdbc.controller.JdbcSql.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.java.ojdbc.controller.BlogDaoImpl;
import edu.java.ojdbc.model.Blog;
import edu.java.ojdbc.view.BlogCreateFrame.OnBlogInsertListener;
import edu.java.ojdbc.view.BlogDetailFrame.OnblogUpdateListener;
import javax.swing.JTextField;

public class BlogMain implements OnBlogInsertListener, OnblogUpdateListener {

    // 메인 화면에서 보여줄 JTable의 컬럼 이름들
    private static final String[] COLUMN_NAMES = { COL_BLOG_NO, COL_TITLE, COL_AUTHOR, COL_MODIFIED_DATE };

    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    private BlogDaoImpl dao;
    

    private JComboBox<String> comboBox;
    private JTextField textKeyword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BlogMain window = new BlogMain();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public BlogMain() {
        initialize();
        dao = BlogDaoImpl.getinstance();
        initializeTable();
    }

    private void initializeTable() {
        // 데이터는 없는, 컬럼 이름들만 설정된 테이블 모델 객체를 생성
        model = new DefaultTableModel(null, COLUMN_NAMES);

        // 테이블에 모델 객체를 설정.
        table.setModel(model);

        // DB에서 데이터를 검색.
        List<Blog> list = dao.select();

        for (Blog b : list) {
            Object[] row = { b.getBlogNo(), b.getTitle(), b.getAuthor(), b.getModifiedDate() };
            model.addRow(row); // 테이블 모델에 행 데이터로 추가.
        }

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setBounds(550, 200, 784, 604);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel();
        frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);

        JButton btnCreate = new JButton("새 글 작성");
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 새 블로그 글 작성 Frame 만들기.
                BlogCreateFrame.newBlogCreateFrame(frame, BlogMain.this); // main.this = main의 주소, this = 익명클래스의 주소
            }
        });
        btnCreate.setFont(new Font("D2Coding", Font.BOLD, 18));
        buttonPanel.add(btnCreate);

        JButton btnRead = new JButton("상세보기");
        btnRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDetailFrame();

            }
        });
        btnRead.setFont(new Font("D2Coding", Font.BOLD, 18));
        buttonPanel.add(btnRead);

        JButton btnDelete = new JButton("삭제");
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteBlog();
            }
        });
        btnDelete.setFont(new Font("D2Coding", Font.BOLD, 18));
        buttonPanel.add(btnDelete);

        JScrollPane scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        model = new DefaultTableModel(null, COLUMN_NAMES);
        table.setModel(new DefaultTableModel(new Object[][] {},
                new String[] { "BLOG_NO", "TITLE", "AUTHOR", "MODIFIED_DATE" }));
        scrollPane.setViewportView(table);

        JPanel searchPanel = new JPanel();
        frame.getContentPane().add(searchPanel, BorderLayout.SOUTH);

        comboBox = new JComboBox<>();
        comboBox.setFont(new Font("D2Coding", Font.PLAIN, 14));

        String[] comboBoxItems = {"ALL", "TITLE", "CONTENT", "TITLE + CONTENT", "AUTHOR" };
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(comboBoxItems);
        comboBox.setModel(comboBoxModel);
        comboBox.setSelectedIndex(0);

        searchPanel.add(comboBox);

        textKeyword = new JTextField();
        textKeyword.setFont(new Font("D2Coding", Font.PLAIN, 18));
        searchPanel.add(textKeyword);
        textKeyword.setColumns(10);

        JButton btnSearch = new JButton("Search List");
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchBlogsByKeyword();

            }

        });
        btnSearch.setFont(new Font("D2Coding", Font.PLAIN, 18));
        searchPanel.add(btnSearch);

        JButton btnAllList = new JButton("All List");
        btnAllList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initializeTable();
            }
        });
        btnAllList.setFont(new Font("D2Coding", Font.PLAIN, 18));
        searchPanel.add(btnAllList);
    }

    private void searchBlogsByKeyword() {
        String keyword = textKeyword.getText().trim();

        if (keyword.equals("")) { // 검색어가 입력되지 않으면

            JOptionPane.showMessageDialog(frame, "무언가를 입력해주셔야 할텐데용", "Warning", 0);

            return;
        }        
        
        
        int type = comboBox.getSelectedIndex();

        // DAO의 검색 타입과 검색어를 argument로 갖는 검색 메서드 호출
        
        List<Blog> list =  dao.search(type, keyword);
        
        model = new DefaultTableModel(null, COLUMN_NAMES);
        
        table.setModel(model);
        
        for (Blog b : list) {
            
            Object[] row = {
                    b.getBlogNo(), b.getTitle(), b.getAuthor(), b.getModifiedDate()
            };
            
            model.addRow(row);
        }
        
    }

    protected void showDetailFrame() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(frame, "뭐라도 눌러야죵", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Integer blogNo = (Integer) model.getValueAt(row, 0);

        BlogDetailFrame.newBlogDetailFrame(frame, blogNo, BlogMain.this); // 7 , BlogMain.this = this > class가 익명클래스가
                                                                          // 아니어서 괜찮음

    }

    protected void deleteBlog() {
        int row = table.getSelectedRow(); // 테이블에서 선택된 행 인덱스

        if (row == -1) { // Table에서 선택된 행이 없는 경우
            JOptionPane.showMessageDialog(frame, // Parent component
                    "선택된게 없으니 삭제할 수 없구료", // message
                    "Error", // title
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 선택된 행에서 고유키 찾기 : 인덱스 0번 컬럼 (Blog_No, Title, Author, Time 순서대로 첫번째가 숫자이기 때문에)

        Integer blogNo = (Integer) model.getValueAt(row, 0); // Object type을 integer로 변환

        int confirm = JOptionPane.showConfirmDialog(frame, "진정 삭제 허실거여유?", "ChEcK", JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(frame, "삭제를 삭제합니당 쿠쿡");
            return;
        }

        int result = dao.delete(blogNo); // delete 메서드에 Blog_No 넘겨주기

        if (result == 1) {
            JOptionPane.showMessageDialog(frame, blogNo + "번 항목은 이제 없슈");

            // 테이블 갱신
            initializeTable();

        } else {
            JOptionPane.showMessageDialog(frame, "삭제 실패", "Erroe", JOptionPane.ERROR_MESSAGE);
        }

    }

    @Override // CreateFrame의 인터페이스 메서드 구현
    public void onBlogInserted() {

        initializeTable();

    }

    @Override
    public void onBlogUpdated() { // UpdateFrame의 인터페이스 메서드 구현

        initializeTable();
    }

}
