package com.designmode.learning.decorate.second;

/**
 * Created by FrankSen on 2017/12/5.
 */
public class ConctectDecorateB extends Decorate{


    @Override
    public void Operation() {
        super.Operation();
        System.out.println(decorateColther());
    }

    public String decorateColther(){
        String doString = "我穿上了衬衫、打上了领带、整理好头发、开始穿上外套，拿上包，准备出门。";
        return doString;
    }

}
