package com.designmode.learning.prototype;

/**
 * Created by FrankSen on 2017/12/27.
 */
public class ConcretePrototype extends Prototype {
    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
