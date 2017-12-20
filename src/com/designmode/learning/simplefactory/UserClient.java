package com.designmode.learning.simplefactory;

import java.util.Scanner;

/**
 * Created by FrankSen on 2017/11/23.
 */
public class UserClient {

    public static void main(String args[]){
        Operation oper = null;
        oper = OperationFactory.createOperation("/");
        Scanner input = new Scanner(System.in);

        oper.setNumberA(Double.parseDouble(input.next()));
        oper.setNumberB(Double.parseDouble(input.next()));
        System.out.println("计算结果为:"+oper.GetResult());
    }
}
