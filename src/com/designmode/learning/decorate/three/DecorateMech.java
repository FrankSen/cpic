package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public abstract class DecorateMech extends Person{
/**
 * @parmam hosts 集群地址
 * @
 *
 * */

    private Person component;

    public void setPerson(Person component){
        this.component = component;
    }

    @Override
    public void Show() {
        if (component != null){
            component.Show();
        }
    }
}
