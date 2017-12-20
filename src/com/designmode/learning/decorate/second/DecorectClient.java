package com.designmode.learning.decorate.second;

/**
 * Created by FrankSen on 2017/12/5.
 */
public class DecorectClient {
    public static void main(String[] args){
        /**装饰的方法：
         * 1.首先用ConcreteComponent实例化对象concrectComponent。
         * 2.然后用DecorateA创建实例化对象来包装第一个对象
         * 3.再用DecorateB创建实例化对象来包装第二个对象
         * 4.最终执行DecorateB的Operation方法
         * */
        ConcrectComponent concrectComponent = new ConcrectComponent();
        ContrectDecorateA decorateA = new ContrectDecorateA();
        ConctectDecorateB decorateB = new ConctectDecorateB();
        decorateA.setComponent(concrectComponent);
        decorateB.setComponent(decorateA);
        decorateB.Operation();
    }
}
