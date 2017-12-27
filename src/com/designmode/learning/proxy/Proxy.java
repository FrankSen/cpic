package com.designmode.learning.proxy;

import com.designmode.learning.proxy.porxyInterf.LoveBehive;

/**
 * Created by FrankSen on 2017/12/20.
 * Idea：代理类
 */
public class Proxy implements LoveBehive {

    /**在代理类中注册追求方*/
    private Pursuer pursuer;

    public Proxy(Girls mm) {
        pursuer = new Pursuer(mm);
    }

    @Override
    public void GiveFlower() {
        pursuer.GiveFlower();
    }

    @Override
    public void GiveDolls() {
        pursuer.GiveDolls();
    }

    @Override
    public void GiveChocolate() {
        pursuer.GiveChocolate();
    }
}
