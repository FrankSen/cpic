package com.designmode.learning.factorymethod;

import com.designmode.learning.factorymethod.factory.IFactory;
import com.designmode.learning.factorymethod.factory.factoryimpl.CreateUndergraduate;
import com.designmode.learning.factorymethod.leifeng.leifengimpl.UnderGraduate;


/**
 * Created by FrankSen on 2017/12/27.
 */
public class FacMeClient {

    public static void main(String[] str){
        IFactory factory = new CreateUndergraduate();

        UnderGraduate underGraduate = (UnderGraduate) factory.createLeiFengTeach();
        underGraduate.buySolid();
        underGraduate.helpThroughRoad();
        underGraduate.sweep();
        underGraduate.wash();
    }
}
