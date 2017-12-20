package com.designmode.learning.strategy.strategyImp;

import com.designmode.learning.strategy.Strategy;

/**
 * Created by FrankSen on 2017/12/1.
 */
public class CashReturn extends Strategy {

    @Override
    public double AlgorithmInterface(double money) {

        return money -(Math.floor(money/300)*100);
    }
}
