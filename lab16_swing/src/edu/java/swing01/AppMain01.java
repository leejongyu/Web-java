package edu.java.swing01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AppMain01 {

    private JFrame frame;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        // 쓰레드를 EventQueue에 등록 -> 자바 가상 머신이 쓰레드를 실행 -> run() 실행
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain01 window = new AppMain01(); // 객체를 생성
                    window.frame.setVisible(true); // 객체를 이용하여 필드의 frame을 호출. 호출 후 frame의 메서드 setVisible을 변경
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AppMain01() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setFont(new Font("D2Coding", Font.PLAIN, 12));
        frame.getContentPane().setBackground(Color.WHITE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JLabel lblText = new JLabel("Hello 스윙!"); // JLabel 객체를 생성
        lblText.setHorizontalAlignment(SwingConstants.CENTER);
        lblText.setFont(new Font("D2Coding", Font.PLAIN, 40));
        lblText.setBackground(Color.DARK_GRAY);
        frame.getContentPane().add(lblText, BorderLayout.NORTH); // JLavel 객체를 frame에 추가.

        JButton btnNewButton = new JButton("누르지 마세요"); // JButton 객체를 생성
        btnNewButton.setFont(new Font("D2Coding", Font.BOLD, 12));
        btnNewButton.setToolTipText("누르면 안됩니다..");
        frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH); // JButton 객체를 frame에 추가.
        
        textField = new JTextField();
        frame.getContentPane().add(textField, BorderLayout.CENTER);
        textField.setColumns(10);

        frame.setBounds(200, 200, 600, 400); // (Frame이 생성되는 가로 위치 ,Frame이 생성되는 세로 위치 , 생성된 Frame의 가로크기 ,생성된 Frame의 세로크기)
                                             // 위치의 기준은 화면 좌상단. 각 위치는 좌상단에서 얼만큼 떨어져 있는지를 표시.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame의 default close option을 생성.
    }
}
