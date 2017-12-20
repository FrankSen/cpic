package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public class TShirts extends DecorateMech{
    @Override
    public void Show() {
        super.Show();
        System.out.println(putTShirt());
    }
    public String putTShirt(){
        String TShirt = "2.我穿上了带有乔丹logo的球衣";
        return TShirt;
    }
}
