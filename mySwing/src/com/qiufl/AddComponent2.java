package com.qiufl;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.SwingUtilities;  
import javax.swing.WindowConstants;  
  
public class AddComponent2 extends JFrame{  
    //�������  
    private JButton jButton1;  
    public AddComponent2(){  
        initGUI();  
        addComp();  
    }  
    private void addComp(){  
        //��ʼ��  
        jButton1 = new JButton("jButton1");  
        //���Ԫ��  
        add(jButton1);  
    }  
    private void initGUI(){  
        setVisible(true);  
        setSize(300,400);  
        setLocationRelativeTo(null);  
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  
    }  
    public static void main(String[] args) {  
        SwingUtilities.invokeLater(new Runnable() {  
            public void run() {  
                AddComponent2 f = new AddComponent2();  
            }                 
        });  
    }  
}  