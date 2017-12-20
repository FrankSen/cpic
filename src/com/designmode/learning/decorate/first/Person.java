package com.designmode.learning.decorate.first;

/**
 * Created by FrankSen on 2017/12/5.
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void WearBigTrouser(){
        System.out.println("垮裤");
    }

    public void WearSneakers(){
        System.out.println("破球鞋");
    }

    public void WearSuit(){
        System.out.println("西装");
    }

    public void WearTie(){
        System.out.println("系领带");
    }

    public void WearLeatherShouse(){
        System.out.println("皮鞋");
    }

    public void ShowtoString(){
        System.out.println("装扮者名字:"+name);
    }


}
