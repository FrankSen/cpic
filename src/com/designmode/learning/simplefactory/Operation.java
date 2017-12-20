package com.designmode.learning.simplefactory;

/**
 * Created by FrankSen on 2017/11/23.
 */
public abstract class Operation {
    private double NumberA = 0;
    private double NumberB = 0;

    public double getNumberA() {
        return NumberA;
    }

    public double getNumberB() {
        return NumberB;
    }

    public void setNumberA(double numberA) {
        NumberA = numberA;
    }

    public void setNumberB(double numberB) {
        NumberB = numberB;
    }

    public double GetResult() {

        double result = 0;
        return result;
    }





}
