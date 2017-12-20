package com.designmode.learning.strategy;

import com.designmode.learning.strategy.strategyImp.CashContext;


/**
 * Created by FrankSen on 2017/12/1.
 */
public class StrategyClient {
    public static void main(String[] args){
        CashContext context = new CashContext();
        context.setDiscountName("");
        System.out.println(context.GetResultHighLevel(1000));

    }
}
