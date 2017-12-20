package com.designmode.learning.simplefactory;

/**
 * Created by FrankSen on 2017/11/23.
 */
class  OperationAdd extends Operation{
    @Override
    public double getNumberB() {
        return super.getNumberB();
    }

    @Override
    public double getNumberA() {
        return super.getNumberA();
    }

    @Override
    public double GetResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}
