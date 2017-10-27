package com.qiufl;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.SwingUtilities;  
import javax.swing.WindowConstants;  
  
public class AddComponent2 extends JFrame{  
    //定义变量  
    private JButton jButton1;  
    public AddComponent2(){  
        initGUI();  
        addComp();  
    }  
    private void addComp(){  
        //初始化  
        jButton1 = new JButton("jButton1");  
        //添加元件  
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