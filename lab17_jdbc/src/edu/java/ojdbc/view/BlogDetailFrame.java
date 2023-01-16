package edu.java.ojdbc.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import edu.java.ojdbc.controller.BlogDaoImpl;
import edu.java.ojdbc.model.Blog;

public class BlogDetailFrame extends JFrame {

    public interface OnblogUpdateListener {
        void onBlogUpdated();
    }

    private OnblogUpdateListener listener;

    private Component parent; // 5-1
    private Integer blogNo;
    private BlogDaoImpl dao;

    private JPanel contentPane;
    private JTextField textBlogNo;
    private JTextField textTitle;
    private JScrollPane scrollPane;
    private JTextArea textContent;
    private JLabel lblAuthor;
    private JTextField textAuthor;
    private JLabel lblBlogNo_1;
    private JLabel lblCreateTime;
    private JLabel lblUpdateTime;
    private JTextField textCreateTime;
    private JTextField textModifiedTime;

    /**
     * Launch the application.
     */
    public static void newBlogDetailFrame(Component parent, Integer blogNo, OnblogUpdateListener listener) { // 2.
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BlogDetailFrame frame = new BlogDetailFrame(parent, blogNo, listener);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public BlogDetailFrame(Component parent, Integer blogNo, OnblogUpdateListener listener) { // 3-2 , 5-5
        this.parent = parent;
        this.blogNo = blogNo; // 상세보기, 수정할 블로그 글 번호
        this.listener = listener; //
        this.dao = BlogDaoImpl.getinstance();

        initialize();

        initializeBlogData(); // JTextFiled와 JTextArea의 내용을 DB에서 검색한 내용으로 채움.

    }

    private void initializeBlogData() {

        Blog blog = dao.select(blogNo);

        if (blog != null) {
            textBlogNo.setText(blog.getBlogNo().toString());
            textTitle.setText(blog.getTitle());
            textContent.setText(blog.getContent());
            textAuthor.setText(blog.getAuthor());
            textCreateTime.setText(blog.getCreatedDate().toString());
            textModifiedTime.setText(blog.getModifiedDate().toString());
        }

    }

    private void initialize() { // 3-1
        setTitle("상세 보기");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 4.

        int x = parent.getX() + 100;
        int y = parent.getY() + 100;
        setBounds(x, y, 960, 621); // 5. , 6.
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblBlogNo = new JLabel("번호");
        lblBlogNo.setHorizontalAlignment(SwingConstants.CENTER);
        lblBlogNo.setBackground(Color.PINK);
        lblBlogNo.setOpaque(true);
        lblBlogNo.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblBlogNo.setBounds(12, 10, 57, 41);
        contentPane.add(lblBlogNo);

        textBlogNo = new JTextField();
        textBlogNo.setHorizontalAlignment(SwingConstants.CENTER);
        textBlogNo.setEnabled(false);
        textBlogNo.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textBlogNo.setBounds(81, 10, 57, 41);
        contentPane.add(textBlogNo);
        textBlogNo.setColumns(10);

        textTitle = new JTextField();
        textTitle.setHorizontalAlignment(SwingConstants.CENTER);
        textTitle.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textTitle.setColumns(10);
        textTitle.setBounds(219, 10, 709, 41);
        contentPane.add(textTitle);

        JLabel lblContent = new JLabel("본문");
        lblContent.setBackground(Color.PINK);
        lblContent.setOpaque(true);
        lblContent.setHorizontalAlignment(SwingConstants.CENTER);
        lblContent.setFont(new Font("D2Coding", Font.PLAIN, 30));
        lblContent.setBounds(12, 61, 916, 34);
        contentPane.add(lblContent);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 105, 916, 367);
        contentPane.add(scrollPane);

        textContent = new JTextArea();
        textContent.setFont(new Font("D2Coding", Font.PLAIN, 28));
        scrollPane.setViewportView(textContent);

        lblAuthor = new JLabel("작성자");
        lblAuthor.setHorizontalAlignment(SwingConstants.CENTER);
        lblAuthor.setOpaque(true);
        lblAuthor.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblAuthor.setBackground(Color.PINK);
        lblAuthor.setBounds(12, 477, 88, 41);
        contentPane.add(lblAuthor);

        textAuthor = new JTextField();
        textAuthor.setHorizontalAlignment(SwingConstants.CENTER);
        textAuthor.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textAuthor.setEnabled(false);
        textAuthor.setColumns(10);
        textAuthor.setBounds(112, 477, 286, 41);
        contentPane.add(textAuthor);

        lblBlogNo_1 = new JLabel("제목");
        lblBlogNo_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblBlogNo_1.setOpaque(true);
        lblBlogNo_1.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblBlogNo_1.setBackground(Color.PINK);
        lblBlogNo_1.setBounds(150, 10, 57, 41);
        contentPane.add(lblBlogNo_1);

        lblCreateTime = new JLabel("작성시간");
        lblCreateTime.setHorizontalAlignment(SwingConstants.CENTER);
        lblCreateTime.setOpaque(true);
        lblCreateTime.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblCreateTime.setBackground(Color.PINK);
        lblCreateTime.setBounds(410, 477, 133, 41);
        contentPane.add(lblCreateTime);

        lblUpdateTime = new JLabel("업데이트 시간");
        lblUpdateTime.setHorizontalAlignment(SwingConstants.CENTER);
        lblUpdateTime.setOpaque(true);
        lblUpdateTime.setFont(new Font("D2Coding", Font.PLAIN, 20));
        lblUpdateTime.setBackground(Color.PINK);
        lblUpdateTime.setBounds(410, 528, 133, 41);
        contentPane.add(lblUpdateTime);

        textCreateTime = new JTextField();
        textCreateTime.setHorizontalAlignment(SwingConstants.CENTER);
        textCreateTime.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textCreateTime.setEnabled(false);
        textCreateTime.setColumns(10);
        textCreateTime.setBounds(555, 477, 373, 41);
        contentPane.add(textCreateTime);

        textModifiedTime = new JTextField();
        textModifiedTime.setHorizontalAlignment(SwingConstants.CENTER);
        textModifiedTime.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textModifiedTime.setEnabled(false);
        textModifiedTime.setColumns(10);
        textModifiedTime.setBounds(555, 528, 373, 41);
        contentPane.add(textModifiedTime);

        JButton btnUpdate = new JButton("수정하기");
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                updateBlog();

            }
        });
        btnUpdate.setFont(new Font("굴림", Font.BOLD, 20));
        btnUpdate.setBounds(12, 538, 126, 31);
        contentPane.add(btnUpdate);
    }

    private void updateBlog() {
        // 수정할 title, content 읽음.

        String title = textTitle.getText();
        String content = textContent.getText();
        if (title.equals("") || content.equals("")) {
            JOptionPane.showMessageDialog(this, "뭔가 비었는데용..", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // dao.update() 호출
        Blog blog = new Blog(blogNo, title, content, null, null, null);
        int result = dao.update(blog);

        if (result == 1) {
            JOptionPane.showMessageDialog(this, blogNo + "번 글이 변경되었으니 확인 바랍니다~");
        } else {
            JOptionPane.showMessageDialog(this, "이걸 발견한 당신. 혹시 lucky man?");
        }

        // frame 닫기
        dispose();
        

        // BlogMain 업데이트 성공을 알려주기
        listener.onBlogUpdated();

    }

}
