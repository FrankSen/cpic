package com.designmode.learning.simplefactory;

/**
 * Created by FrankSen on 2017/11/23.
 */
public class OperationFactory {
    public static Operation createOperation(String functionName){
        Operation operationName = null;

        switch (functionName){
            case "+":
                operationName = new OperationAdd();
                break;
            case "-":
                operationName = new OperationSub();
                break;
            case "*":
                operationName = new OperationMutil();
                break;
            case "/":
                operationName = new OperationDiv();
                break;

        }
        return operationName;
    }
}
