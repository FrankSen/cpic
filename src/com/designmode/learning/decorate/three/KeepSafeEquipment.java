package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public class KeepSafeEquipment extends DecorateMech {
    @Override
    public void Show() {
        super.Show();
        System.out.println(putOnSafeEquipment());
    }

    public String putOnSafeEquipment(){
        String safeEquipment ="4.带上护腕、护膝，准备好牙套";
        return safeEquipment;
    }
}
