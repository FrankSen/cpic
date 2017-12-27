package com.designmode.learning.frameJUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by FrankSen on 2017/12/1.
 */
public class MyWinDemo {
    private Frame f;
    private TextField tf;
    private Button btn;
    MyWinDemo(){
        init();
    }
    public static void main(String[] args){
        new MyWinDemo();
    }
    private  void  init() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("文件(F)");
        file.setMnemonic('F');
        JMenuItem open = new JMenuItem("打开");
        JMenuItem close = new JMenuItem("关闭");
        file.add(open);
        file.addSeparator();
        file.add(close);
        menuBar.add(file);

    }

}
