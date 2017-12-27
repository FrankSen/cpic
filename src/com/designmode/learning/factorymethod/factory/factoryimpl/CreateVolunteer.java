package com.designmode.learning.factorymethod.factory.factoryimpl;

import com.designmode.learning.factorymethod.factory.IFactory;
import com.designmode.learning.factorymethod.leifeng.LeiFeng;
import com.designmode.learning.factorymethod.leifeng.leifengimpl.Volunteer;

/**
 * Created by FrankSen on 2017/12/27.
 */
public class CreateVolunteer implements IFactory {

    private Volunteer volunteer;

    @Override
    public LeiFeng createLeiFengTeach() {
        volunteer = new Volunteer();
        return volunteer;
    }
}
