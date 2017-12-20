package com.designmode.learning.strategy.strategyImp;
import com.designmode.learning.strategy.strategyImp.CashRebate;
import com.designmode.learning.strategy.strategyImp.CashNormal;
import com.designmode.learning.strategy.strategyImp.CashReturn;
import com.designmode.learning.strategy.Strategy;

/**
 * Created by FrankSen on 2017/12/1.
 */
public class CashContext {
    Strategy strategy;
    String discountName;
    Strategy cs;

    public CashContext(){}

    public CashContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public String getDiscountName() {
        return discountName;
    }



    public double GetResultHighLevel(double money){

        System.out.println(discountName+"~~~~~~~~~");
        switch (discountName){
            case "正常":
                CashNormal cs1 = new CashNormal();
                cs = cs1;
                break;
            case "打8折":
                CashRebate cs2 = new CashRebate();
                cs = cs2;
                break;
            case "满300减100":
                CashReturn cs3 = new CashReturn();
                cs = cs3;
                break;
                default:
                    System.out.println("没有选择");
                    break;
        }
        return cs.AlgorithmInterface(money);
    }

    public double GetResult(double money){
        return  strategy.AlgorithmInterface(money);
    }


}
