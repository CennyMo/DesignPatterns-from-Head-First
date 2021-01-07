package Decorate.correctCode;

import Decorate.correctCode.Coffee.DarkRoast;
import Decorate.correctCode.Condiments.Milk;
import Decorate.correctCode.Condiments.Mocha;
import Decorate.correctCode.Condiments.Soy;

public class test {
    public static void main(String args[]){

        // 让调料和饮料都继承同一个抽象类，就可以一直使用一个beverage来表示这个饮料
        // 如果CondimentDecorator不继承Beverage，此处就要实例化一个condimentDecorator
        // 由condimentDecorator来调用cost。 如果有其他需求，比如杯子大小、冷热程度等需求，显然会显得非常杂乱
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Milk(beverage);

        System.out.println(beverage.cost());
    }
}
