package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public class Shoes extends DecorateMech {
    @Override
    public void Show() {
        super.Show();
        System.out.println(putShoes());
    }

    public String putShoes(){
        String shoes = "5.穿上昨天买的Peak△篮球鞋";
        return shoes;
    }
}
