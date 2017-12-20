package com.designmode.learning.simplefactory;

/**
 * Created by FrankSen on 2017/11/23.
 */
class OperationDiv extends Operation{
    @Override
    public double getNumberA() {
        return super.getNumberA();
    }

    @Override
    public double getNumberB() {
        return super.getNumberB();
    }

    @Override
    public double GetResult() {
        double result = 0;
        if(getNumberB() == 0){
            System.out.print("除数不能为0");
        }else{
            result = getNumberA() / getNumberB();
        }
        return result;
    }
}
