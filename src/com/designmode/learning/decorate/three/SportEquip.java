package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public class SportEquip extends DecorateMech {



    @Override
    public void Show() {
        super.Show();
        System.out.println(sportEquip());
    }

    public String sportEquip(){
        String sportEquip ="6.拿上篮球，奔向篮球场~~~~~";
        return sportEquip;
    }
}
