package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public class SportEquip extends DecorateMech {

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println(sportEquip());
    }

    public String sportEquip(){
        String sportEquip ="6.拿上篮球，奔向篮球场~~~~~"+"\n 的"+getName();
        return sportEquip;
    }
}
