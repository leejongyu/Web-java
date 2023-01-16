package edu.java.swing05;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppMain05 {

    private JFrame frame;
    private JButton btnPrev;
    private JButton btnNext;
    private JLabel lblImage;
    private static final String[] IMAGES = { "images/flower1.jpg", "images/flower2.jpg", "images/flower3.jpg",
            "images/flower4.jpg", "images/flower5.jpg" };
    private int index;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain05 window = new AppMain05();
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
    public AppMain05() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        lblImage = new JLabel(new ImageIcon(IMAGES[index]));

        lblImage.setBounds(0, 0, 640, 700);
        frame.getContentPane().add(lblImage);

        btnPrev = new JButton("\"Prev\"");
        btnPrev.addActionListener(e -> click(e));
        btnPrev.setBounds(650, 32, 97, 45);
        frame.getContentPane().add(btnPrev);

        btnNext = new JButton("\"Next\"");
        btnNext.addActionListener(e -> click(e));
        btnNext.setBounds(650, 624, 97, 45);
        frame.getContentPane().add(btnNext);
    }

    private void click(ActionEvent e) {
        if (e.getSource() == btnPrev) {
            index--;
            if (index < 0) {
                index = IMAGES.length-1;
            }
        } else {
            index++;
            if (index == IMAGES.length) {
                index = 0;
            }
        }
        lblImage.setIcon(new ImageIcon(IMAGES[index]));
    }

}
