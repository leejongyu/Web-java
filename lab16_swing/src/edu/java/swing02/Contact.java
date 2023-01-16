package edu.java.swing02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Rectangle;

public class Contact {

    private JFrame frame;
    private JTextField textName;
    private JTextField textNumber;
    private JTextField textMail;
    private JTextArea textOutput;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Contact window = new Contact();
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
    public Contact() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setBounds(100, 100, 600, 470);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblName = new JLabel("이름");
        lblName.setBackground(new Color(255, 255, 255));
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        lblName.setFont(new Font("D2Coding", Font.PLAIN, 20));
        lblName.setBounds(38, 60, 120, 30);
        frame.getContentPane().add(lblName);

        JLabel lblNumber = new JLabel("연락처");
        lblNumber.setBackground(new Color(148, 0, 211));
        lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumber.setFont(new Font("D2Coding", Font.PLAIN, 20));
        lblNumber.setBounds(38, 140, 120, 30);
        frame.getContentPane().add(lblNumber);

        JLabel lblMail = new JLabel("메일주소");
        lblMail.setBackground(new Color(148, 0, 211));
        lblMail.setHorizontalAlignment(SwingConstants.CENTER);
        lblMail.setFont(new Font("D2Coding", Font.PLAIN, 20));
        lblMail.setBounds(38, 220, 120, 30);
        frame.getContentPane().add(lblMail);

        textName = new JTextField();
        textName.setBounds(170, 60, 230, 30);
        frame.getContentPane().add(textName);
        textName.setColumns(10);

        textNumber = new JTextField();
        textNumber.setBounds(170, 140, 230, 30);
        frame.getContentPane().add(textNumber);
        textNumber.setColumns(10);

        textMail = new JTextField();
        textMail.setBounds(170, 220, 230, 30);
        frame.getContentPane().add(textMail);
        textMail.setColumns(10);

        JButton btnInput = new JButton("입력");
        btnInput.addActionListener(e -> printInfo());
        btnInput.setFont(new Font("D2Coding", Font.PLAIN, 15));
        btnInput.setBounds(440, 220, 100, 30);
        frame.getContentPane().add(btnInput);

        textOutput = new JTextArea();
        textOutput.setTabSize(15);
        textOutput.setBackground(Color.WHITE);
        textOutput.setFont(new Font("D2Coding", Font.PLAIN, 20));
        textOutput.setText("   ");
        textOutput.setBounds(38, 270, 500, 140);
        frame.getContentPane().add(textOutput);
    }
    
    
    // 입력 버튼을 클릭했을 떄 실행 될 내용
    private void printInfo() {

        // 문자열 저장
        String name = textName.getText();
        String number = textNumber.getText();
        String mail = textMail.getText();

        // JTextArea에 출력 할 문자열 만들기
        StringBuilder buffer = new StringBuilder();
        buffer.append("이름 : ").append(name).append("\n")
              .append("전화번호 : ").append(number).append("\n")
              .append("메일 : ").append(mail);

        // 만들어진 문자열을 JTextArea에 출력
        textOutput.setText(buffer.toString());
        
    }
    
}
