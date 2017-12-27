package com.designmode.learning.prototype;

import com.designmode.learning.decorate.three.ConcreteDecorate;

/**
 * Created by FrankSen on 2017/12/27.
 */
public class ProtoTypeClient {

    /**原型模式：用原型创建新的原型种类，并通过拷贝这些原型创建新的对象
     * 通过一个原型创建一个可定制的对象，而且不需要知道任何创建过程。
     * */
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setId("ff");
//      调用克隆方法
        ConcretePrototype concretePrototype1 = (ConcretePrototype) concretePrototype.clone();
        concretePrototype1.setId("sensen");
        System.out.println(concretePrototype1.getId());
        System.out.println(concretePrototype.getId());
    }
}
