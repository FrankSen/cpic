package com.designmode.learning.factorymethod.factory.factoryimpl;

import com.designmode.learning.factorymethod.leifeng.LeiFeng;
import com.designmode.learning.factorymethod.factory.IFactory;
import com.designmode.learning.factorymethod.leifeng.leifengimpl.UnderGraduate;

/**
 * Created by FrankSen on 2017/12/27.
 */
public class CreateUndergraduate implements IFactory {

    private UnderGraduate  underGraduate;

    @Override
    public LeiFeng createLeiFengTeach() {
        underGraduate = new UnderGraduate();
        return underGraduate;
    }
}
