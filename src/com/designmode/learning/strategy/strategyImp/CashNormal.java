package com.designmode.learning.strategy.strategyImp;

import com.designmode.learning.strategy.Strategy;

/**
 * Created by FrankSen on 2017/12/1.
 */
public class CashNormal extends Strategy {

    @Override
    public double AlgorithmInterface(double money) {
        return money;
    }
}
