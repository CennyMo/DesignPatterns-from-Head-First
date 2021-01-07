package Decorate.correctCode.Condiments;

import Decorate.correctCode.Beverage;
import Decorate.correctCode.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int cost() {
        return 2 + beverage.cost();
    }
}
