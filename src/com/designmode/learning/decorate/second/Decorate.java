package com.designmode.learning.decorate.second;

/**
 * Created by FrankSen on 2017/12/5.
 */
public abstract class Decorate extends Component {
    private  Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if(component != null){
            component.Operation();
        }
    }
}
