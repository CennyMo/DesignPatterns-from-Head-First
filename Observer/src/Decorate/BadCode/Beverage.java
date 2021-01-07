package Decorate.BadCode;

/*
* 饮料抽象类
* 具体的饮料，如摩卡、蓝山、巴西风味，则继承此抽象类，
* 并返回其具体价格
* */
public abstract class Beverage {
    protected String description;

    // 用于描述饮料具体信息
    public String getDescription(){
        return description;
    }

    // 每个子类来决定返回的价钱
    public abstract int cost();

}
