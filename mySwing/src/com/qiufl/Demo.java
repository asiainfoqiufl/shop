package com.qiufl;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo {
    public static void main(String[] args) {
        // 创建JFrame
        JFrame framed = new JFrame("hello,world");
        
        // 创建按钮
        JButton button = new JButton("OK");
        // 向frame中添加一个按钮
        framed.add(button);

        
        // 设置尺寸
        framed.setSize(500, 300);
        // JFrame在屏幕居中
        framed.setLocationRelativeTo(null);
        // JFrame关闭时的操作
        framed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 显示JFrame
        framed.setVisible(true);

    }
}