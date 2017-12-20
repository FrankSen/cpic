package com.designmode.learning.proxy;

import com.designmode.learning.proxy.porxyInterf.LoveBehive;

/**
 * Created by FrankSen on 2017/12/20.
 * Idea: 追求者类
 */
public class Pursuer implements LoveBehive{


    private Girls girls;

    public Pursuer(Girls girls) {
        this.girls = girls;
    }

    @Override
    public void GiveFlower() {
        System.out.println(girls.getName()+":送你的玫瑰花！");
    }

    @Override
    public void GiveDolls() {
        System.out.println(girls.getName()+":送你的洋娃娃！");
    }

    @Override
    public void GiveChocolate() {

        System.out.println(girls.getName()+":送你的巧克力！");
    }
}
