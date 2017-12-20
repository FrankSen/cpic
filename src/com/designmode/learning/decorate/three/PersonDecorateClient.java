package com.designmode.learning.decorate.three;

/**
 * Created by FrankSen on 2017/12/19.
 */
public class PersonDecorateClient {
    public static void main(String[] args){


        Person person = new Person("FF");
        ConcreteDecorate concreteDecorate = new ConcreteDecorate();
        TShirts tShirts = new TShirts();
        Pants pants = new Pants();
        KeepSafeEquipment keepSafeEquipment = new KeepSafeEquipment();
        Shoes shoes = new Shoes();
        SportEquip sportEquip = new SportEquip();

//        concreteDecorate.setPerson(person);
        tShirts.setPerson(concreteDecorate);
        pants.setPerson(tShirts);
        keepSafeEquipment.setPerson(pants);
        shoes.setPerson(keepSafeEquipment);
        shoes.Show();
//        sportEquip.setPerson(shoes);
        sportEquip.setPerson(person);
        sportEquip.Show();


    }
}
