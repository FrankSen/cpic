package com.designmode.learning.decorate.second;

/**
 * Created by FrankSen on 2017/12/5.
 */
public class ContrectDecorateA extends Decorate {
    private String addFunction;
    @Override
    public void Operation() {
        super.Operation();
        addFunction = "我要开始喷点香水了";
        System.out.println(putColther()+" ,"+addFunction);
    }

    public String putColther(){
        return "穿上内裤、袜子、鞋子";
    }
}
