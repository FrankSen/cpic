package com.designmode.learning.proxy;

import com.designmode.learning.proxy.Girls;
import com.designmode.learning.proxy.Proxy;

/**
 * Created by FrankSen on 2017/12/20.
 */
public class ProxyClient {
    public static void main(String[] args){
        /**
         * 代理模式：
         *   角色：需求方、代理方、受众
         *   任务：需求方对受众的需求任务，交给代理方来完成。
         *          在完成需求的过程中，所有为完成任务的所准备的物品均来自需求方。
         *          代理方代理需求，所以代理方使用的是需求方的物品。
         *   核心定义：在访问对象时，引入一定的间接性，这种间接性可以实现多种用途。
         *             如，1.将访问的对象设定权限，指定用户访问。实现对象的安全代理。
         *                 2.远程代理
         *                 3.虚拟代理
         *
         * */
        Girls girls = new Girls();
        girls.setName("亲爱的FF");
        /**代理类Proxy，代理的目标是Girls*/
        Proxy proxy = new Proxy(girls);
        /**开始完成代理任务1，为girls赠送巧克力。*/
        proxy.GiveChocolate();
        /**开始完成代理任务2，为girls赠送洋娃娃。*/
        proxy.GiveDolls();
        /**开始完成代理任务3，为girls赠送玫瑰。*/
        proxy.GiveFlower();
    }
}
