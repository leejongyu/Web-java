package edu.java.swing02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator {

    private JFrame frame;
    private JTextField textNum1;
    private JTextField textNum2;
    private JTextArea textResult;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
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
    public Calculator() {
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
        lblNum1.setOpaque(true);
        lblNum1.setBackground(new Color(192, 192, 192));
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

        JButton btnPlus = new JButton("+");
        btnPlus.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnPlus.addActionListener(e -> plus());
        btnPlus.setBounds(60, 211, 90, 40);
        frame.getContentPane().add(btnPlus);

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(e -> minus());
        btnMinus.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnMinus.setBounds(160, 211, 90, 40);
        frame.getContentPane().add(btnMinus);

        JButton btnGop = new JButton("X");
        btnGop.addActionListener(e -> Gop());
        btnGop.setFont(new Font("D2Coding", Font.PLAIN, 18));
        btnGop.setBounds(260, 211, 90, 40);
        frame.getContentPane().add(btnGop);

        JButton btnDIvide = new JButton("/");
        btnDIvide.addActionListener(e -> divide());
        btnDIvide.setFont(new Font("D2Coding", Font.PLAIN, 18));
        btnDIvide.setBounds(360, 211, 90, 40);
        frame.getContentPane().add(btnDIvide);

        textResult = new JTextArea();
        textResult.setFont(new Font("D2Coding", Font.PLAIN, 30));
        textResult.setBounds(12, 312, 468, 188);
        frame.getContentPane().add(textResult);
    }

    private void plus() {

        try {
            int sum = Integer.parseInt(textNum1.getText()) + Integer.parseInt(textNum2.getText());
            textResult.setText(String.format("%d", sum));
        } catch (Exception e) {
            textResult.setText("오류입니다!");
        }
    }

    private void minus() {
        try {
            int minus = Integer.parseInt(textNum1.getText()) - Integer.parseInt(textNum2.getText());
            textResult.setText(String.format("%d", minus));
        } catch (Exception e) {
            textResult.setText("오류입니다!");
        }
    }

    private void Gop() {
        try {
            int gop = Integer.parseInt(textNum1.getText()) * Integer.parseInt(textNum2.getText());
            textResult.setText(String.format("%d", gop));
        } catch (Exception e) {
            textResult.setText("오류입니다!");
        }
    }
    
    private void divide() {
        try {
            double divide = (double) Integer.parseInt(textNum1.getText()) / Integer.parseInt(textNum2.getText());
            textResult.setText(String.format("%f", divide));
        } catch (Exception e) {
            textResult.setText("오류입니다!");
        }
    }
}
