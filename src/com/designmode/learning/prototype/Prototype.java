package com.designmode.learning.prototype;

/**
 * Created by FrankSen on 2017/12/27.
 * Java 的原型需要实现Cloneable
 */
public  class Prototype implements Cloneable {
    private String id;

    public Prototype(){}
    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
