package com.qiufl;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo {
    public static void main(String[] args) {
        // ����JFrame
        JFrame framed = new JFrame("hello,world");
        
        // ������ť
        JButton button = new JButton("OK");
        // ��frame�����һ����ť
        framed.add(button);

        
        // ���óߴ�
        framed.setSize(500, 300);
        // JFrame����Ļ����
        framed.setLocationRelativeTo(null);
        // JFrame�ر�ʱ�Ĳ���
        framed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ��ʾJFrame
        framed.setVisible(true);

    }
}