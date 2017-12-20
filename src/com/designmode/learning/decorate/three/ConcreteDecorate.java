package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public class ConcreteDecorate extends DecorateMech{


    @Override
    public void Show() {
        super.Show();
        System.out.println("1.穿上内衣~~~~~~~~~");
    }
}
