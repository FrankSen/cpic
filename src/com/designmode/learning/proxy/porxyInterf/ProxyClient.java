package com.designmode.learning.proxy.porxyInterf;

import com.designmode.learning.proxy.Girls;
import com.designmode.learning.proxy.Proxy;
import com.designmode.learning.proxy.Pursuer;

/**
 * Created by FrankSen on 2017/12/20.
 */
public class ProxyClient {
    public static void main(String[] args){
        Girls girls = new Girls();
        girls.setName("亲爱的FF");
        Proxy proxy = new Proxy(girls);
        proxy.GiveChocolate();
        proxy.GiveDolls();
        proxy.GiveFlower();
    }
}
