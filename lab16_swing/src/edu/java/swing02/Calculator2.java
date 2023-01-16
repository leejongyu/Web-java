package edu.java.swing02;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator2 {

    private JFrame frame;
    private JTextField textNum1;
    private JTextField textNum2;
    private JTextArea textResult;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator2 window = new Calculator2();
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
    public Calculator2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 508, 608);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNum1 = new JLabel("Num 1");
        lblNum1.setBackground(new Color(160, 82, 45));
        lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNum1.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblNum1.setBounds(33, 60, 85, 40);
        frame.getContentPane().add(lblNum1);

        JLabel lblNum2 = new JLabel("Num 2");
        lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNum2.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblNum2.setBounds(33, 120, 85, 40);
        frame.getContentPane().add(lblNum2);

        textNum1 = new JTextField();
        textNum1.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textNum1.setBounds(130, 60, 320, 40);
        frame.getContentPane().add(textNum1);
        textNum1.setColumns(10);

        textNum2 = new JTextField();
        textNum2.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textNum2.setColumns(10);
        textNum2.setBounds(130, 120, 320, 40);
        frame.getContentPane().add(textNum2);

        btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 파라미터 ActionEvent e : 이벤트가 발생한 컴포넌트, 이벤트의 종류 등에 대한 정보를 가지고 있는 객체
                // ActionEvent.getSource() : 이벤트가 발생한 컴포넌트를 리턴
                performCalculation(e);
            }
        });
        btnPlus.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnPlus.setBounds(60, 211, 90, 40);
        frame.getContentPane().add(btnPlus);

        btnMinus = new JButton("-");
        btnMinus.addActionListener(e -> performCalculation(e));
        btnMinus.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnMinus.setBounds(160, 211, 90, 40);
        frame.getContentPane().add(btnMinus);

        btnMultiply = new JButton("X");
        btnMultiply.addActionListener(e -> performCalculation(e));
        btnMultiply.setFont(new Font("D2Coding", Font.PLAIN, 18));
        btnMultiply.setBounds(260, 211, 90, 40);
        frame.getContentPane().add(btnMultiply);

        btnDivide = new JButton("/");
        btnDivide.addActionListener(e -> performCalculation(e));
        btnDivide.setFont(new Font("D2Coding", Font.PLAIN, 18));
        btnDivide.setBounds(360, 211, 90, 40);
        frame.getContentPane().add(btnDivide);

        textResult = new JTextArea();
        textResult.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textResult.setBounds(12, 312, 468, 188);
        frame.getContentPane().add(textResult);
    }

    private void performCalculation(ActionEvent e) {
        
        try {

            // JTextfield에 입력된 문자열을 읽고, double 타입으로 변환
            String s1 = textNum1.getText();
            String s2 = textNum2.getText();

            double num1 = Double.parseDouble(s1);
            double num2 = Double.parseDouble(s2);

            double result = 0;
            String op = " ";

            Object source = e.getSource();

            if (source == btnPlus) {
                result = num1 + num2;
                op = "+";
            } else if (source == btnMinus) {
                result = num1 - num2;
                op = "-";
            } else if (source == btnMultiply) {
                result = num1 * num2;
                op = "X";
            } else if (source == btnDivide) {
                result = num1 / num2;
                op = "/";
            }

            String output = String.format("%f %s %f = %f", num1 , op , num2, result);
            
            textResult.setText(output);

        } catch (Exception error) {
            return;
        }
        
    }
}
