package com.designmode.learning.decorate.first;

/**
 * Created by FrankSen on 2017/12/5.
 */
public class DecorateClient {
    public static void main(String[] args){
        /**这样的装饰都是在客户端
         * 完成的，这好比我们在别人面前
         * 一件件的将衣服穿起。显然这是不正确的方式。
         * 因此，我们必须在内部完成衣服的穿戴。
         * 这就是装饰模式的真正目的。
         * */

        Person person = new Person("FF");
        System.out.println("\n开始穿衣服：");
        person.WearLeatherShouse();
        person.WearSuit();
        person.WearTie();
        person.ShowtoString();

    }

}
