package com.qiufl;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MouseEventDemo extends JFrame {
    MouseEventDemo() {
        JButton button = new JButton("ok");
        JTextArea text = new JTextArea();
        add(button, BorderLayout.NORTH);
        add(text, BorderLayout.CENTER);

        button.addMouseListener(new MouseListener() {

            // 鼠标按钮在组件上释放时调用。
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标释放");

            }

            // 鼠标按键在组件上按下时调用。
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按下组件");

            }

            // 鼠标离开组件时调用。
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标离开组件");

            }

            // 鼠标进入到组件上时调用。
            public void mouseEntered(MouseEvent e) {
                // 鼠标进入
                System.out.println("鼠标进入组件");

            }

            // 鼠标按键在组件上单击（按下并释放）时调用。
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标单击组件");

            }
        });
        text.addKeyListener(new KeyListener() {

            // 键入某个键时调用此方法。
            public void keyTyped(KeyEvent e) {
                System.out.println("键入某个键");
                if (e.getKeyChar() == 'q') {
                    System.exit(0);
                }
            }
            // 释放某个键时调用此方法。
            public void keyReleased(KeyEvent e) {
                System.out.println("按键释放");

            }

            // 按下某个键时调用此方法。
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下");
            }
        });
    }

    public static void main(String[] args) {
        MouseEventDemo frame = new MouseEventDemo();
        frame.setTitle("鼠标事件");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}