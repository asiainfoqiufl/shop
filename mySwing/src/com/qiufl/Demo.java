package com.qiufl;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo {
    public static void main(String[] args) {
        // ����JFrame
        JFrame frame = new JFrame("hello,world");
        
        // ������ť
        JButton button = new JButton("OK");
        // ��frame������һ����ť
        frame.add(button);

        
        // ���óߴ�
        frame.setSize(500, 300);
        // JFrame����Ļ����
        frame.setLocationRelativeTo(null);
        // JFrame�ر�ʱ�Ĳ���
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ��ʾJFrame
        frame.setVisible(true);

    }
}