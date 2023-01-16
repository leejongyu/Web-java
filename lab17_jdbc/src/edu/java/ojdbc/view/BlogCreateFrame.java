package edu.java.ojdbc.view;

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

public class BlogCreateFrame extends JFrame {
    
    public interface OnBlogInsertListener { // 7
        void onBlogInserted();
    }

    private OnBlogInsertListener listener;
    
    private Component parent; // 4 부모 컴포넌트를 저장하기 위한 필드
    
    private BlogDaoImpl dao; // 5 DB테이블 기능을 갖고 있는 객체.
    
    private JPanel contentPane;
    private JTextField textTitle;
    private JTextField textAuthor;
    private JTextArea textContent;

    /**
     * Launch the application.
     */
    // tightly coupling ? 
    public static void newBlogCreateFrame(Component parent, OnBlogInsertListener listener) { // 2 MAIN 없애고 메서드로 바꾸기, argument 지우기
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BlogCreateFrame frame = new BlogCreateFrame(parent, listener);
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
    
    public BlogCreateFrame(Component parent, OnBlogInsertListener listener) { // 2 새로운 생성자 생성
        
        this.parent = parent; // 4
        
        this.listener = listener;
        
        this.dao = BlogDaoImpl.getinstance(); // 5.
        
        initialize(); // 2  UI 컴포넌트들(라벨, 텍스트 필드 등)이 생성, 초기화
        
    }
    
    public void initialize() { // 2 생성자를 메서드로 변경
        
        setTitle("새 블로그 글 작성");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 2  닫기 버튼 클릭 시, 현재 창을 닫는 것으로 변경.
        
        int x = parent.getX() + 150;
        int y = parent.getY();
        setBounds(x, y, 538, 750);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblTitle = new JLabel("제목");
        lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
        lblTitle.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblTitle.setBounds(12, 10, 498, 30);
        contentPane.add(lblTitle);
        
        JLabel lblContent = new JLabel("내용");
        lblContent.setHorizontalAlignment(SwingConstants.LEFT);
        lblContent.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblContent.setBounds(12, 124, 498, 30);
        contentPane.add(lblContent);
        
        textTitle = new JTextField();
        textTitle.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textTitle.setBounds(12, 50, 498, 64);
        contentPane.add(textTitle);
        textTitle.setColumns(10);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 164, 498, 330);
        contentPane.add(scrollPane);
        
        textContent = new JTextArea();
        textContent.setFont(new Font("D2Coding", Font.PLAIN, 18));
        scrollPane.setViewportView(textContent);
        
        JLabel lblAuthor = new JLabel("작성자");
        lblAuthor.setHorizontalAlignment(SwingConstants.LEFT);
        lblAuthor.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblAuthor.setBounds(12, 504, 498, 30);
        contentPane.add(lblAuthor);
        
        textAuthor = new JTextField();
        textAuthor.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textAuthor.setColumns(10);
        textAuthor.setBounds(12, 544, 498, 64);
        contentPane.add(textAuthor);
        
        JButton btnCreate = new JButton("작성 완료");
        btnCreate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createNewBlogPost();
            }
        });
        btnCreate.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnCreate.setBounds(304, 635, 206, 66);
        contentPane.add(btnCreate);
    }

    private void createNewBlogPost() {
        // 6 제목, 내용, 작성자 정보 읽음.
        
        String title = textTitle.getText();
        String content = textContent.getText();
        String author = textAuthor.getText();
        
        if (title.equals("") || content.equals("") || author.equals("")) {
            JOptionPane.showMessageDialog(this, /* this = create frame, 생성된 인스턴스의 주소 */
                    "공백의 미는 추구하지 않습니다.",  /* message */
                    "ERROR", /* title */
                    JOptionPane.ERROR_MESSAGE); 
            
            return; // null 이 되면 안되는 항목이 null 이라면 메서드 종료
        }
        
        // 제목, 내용, 작성자 -> Blog 객체 생성
        Blog blog = new Blog(null, title, content, author, null, null);
        
        // dao의 insert 메서드 호출 -> DB에 저장
        int result = dao.insert(blog);
        
        if (result == 1) { // insert 성공
            JOptionPane.showMessageDialog(this, "새 글이 업로드 됩니다.");
            
            // 현재 창 닫기
            dispose();
            
            // 테이블 최신화 > Main의 주소를 갖고, 그 주소의 테이블을 최신화
            listener.onBlogInserted();
            
            
        } else { // insert 실패
            JOptionPane.showMessageDialog(this, "업로드에 실패하였습니다.",
                    "ERROR" ,JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
}
