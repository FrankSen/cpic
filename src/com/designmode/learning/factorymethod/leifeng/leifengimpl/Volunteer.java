package com.designmode.learning.factorymethod.leifeng.leifengimpl;

import com.designmode.learning.factorymethod.leifeng.LeiFeng;

/**
 * Created by FrankSen on 2017/12/27.
 */
public class Volunteer implements LeiFeng {
    @Override
    public void wash() {
        System.out.println("洗衣");
    }

    @Override
    public void buySolid() {
        System.out.println("买油");
    }

    @Override
    public void helpThroughRoad() {
        System.out.println("帮助老奶奶过马路");
    }

    @Override
    public void sweep() {
        System.out.println("扫地");
    }

    public void cooking(){
        System.out.println("做饭");

    }

    public void CleanCommunityEnv(){
        System.out.println("清理社区环境");

    }
}
