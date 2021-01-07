package Decorate.BadCode2;

/*
* 饮料抽象类
* 具体的饮料，如摩卡、蓝山、巴西风味，则继承此抽象类，
* 并返回其具体价格
* */
public abstract class Beverage {
    protected String description;
    protected boolean milk;
    protected boolean soy;
    protected boolean mocha;
    protected boolean whip;
    protected int cost = 0;
    // 用于描述饮料具体信息
    public String getDescription(){
        return description;
    }

    // 每个子类来决定返回的价钱
    public int cost() {
        if(milk){ cost+=1; }
        if(soy){ cost+=2; }
        if(mocha){ cost += 1;}
        if(whip){ cost +=3; }
        return cost;
    };

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
