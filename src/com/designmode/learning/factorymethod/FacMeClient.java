package com.designmode.learning.factorymethod;

import com.designmode.learning.factorymethod.factory.IFactory;
import com.designmode.learning.factorymethod.factory.factoryimpl.CreateVolunteer;
import com.designmode.learning.factorymethod.leifeng.leifengimpl.Volunteer;


/**
 * Created by FrankSen on 2017/12/27.
 */
public class FacMeClient {

    public static void main(String[] str){
        /**工厂模式*/
//        IFactory factory = new CreateUndergraduate(); //继承雷锋精神的大学生
        IFactory factory = new CreateVolunteer(); //继承雷锋精神的社区志愿者

        Volunteer volunteer = (Volunteer) factory.createLeiFengTeach();
        volunteer.buySolid();
        volunteer.helpThroughRoad();
        volunteer.sweep();
        volunteer.wash();
        volunteer.cooking();
        volunteer.CleanCommunityEnv();
    }
}
