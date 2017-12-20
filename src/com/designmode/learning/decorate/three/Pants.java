package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public class Pants extends DecorateMech {
    @Override
    public void Show() {
        super.Show();
        System.out.println(putPants());
    }

    public String putPants(){
        String pants = "3.穿上短裤。。。";
        return pants;
    }
}
