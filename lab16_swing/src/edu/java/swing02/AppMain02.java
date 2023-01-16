package edu.java.swing02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain02 {

    private JFrame frame;
    private JTextField textInput;
    private JLabel lblResult;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain02 window = new AppMain02();
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
    public AppMain02() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 652, 476);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        
        lblResult = new JLabel();          // 지역변수
        lblResult.setBackground(Color.DARK_GRAY);
        lblResult.setFont(new Font("D2Coding", Font.PLAIN, 32));
        lblResult.setBounds(10, 10, 610, 60);
        frame.getContentPane().add(lblResult);                      // JLabel 삽입
        
        textInput = new JTextField();                               // 필드변수
        textInput.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textInput.setBounds(10, 99, 610, 211);
        frame.getContentPane().add(textInput);                      // textInput 삽입
        textInput.setColumns(10);
        
        JButton btnInput = new JButton("입력");
        
        // 버튼에 이벤트 핸들러를 설정 : 이벤트가 발생했을 때 그 이벤트를 처리할 수 있는 객체를 정의.
        btnInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 버튼이 클릭됐을 대 할 일을 정의
                // 1. JTextField에 입력된 내용을 읽음
                String input = textInput.getText();
                
                // 2. 읽은 내용을 JLabel에 저장
                lblResult.setText(input);
            }
        });
        btnInput.setToolTipText("누르면 입력됩니다");
        btnInput.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnInput.setBounds(10, 320, 610, 107);
        frame.getContentPane().add(btnInput);
        
    }
}
