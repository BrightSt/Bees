package com.dms.bees.modular.newfeatures.java8;

import javax.swing.*;

/**
 * lambda 表达式示例
 */
public class LambdaTest extends JFrame {

    private JButton jButton;

    public LambdaTest(){
        this.setBounds(200,200,400,200);
        this.setTitle("lambda测试");

        jButton = new JButton("click");

        this.add(jButton);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
