package Decorate.correctCode.Condiments;

import Decorate.correctCode.Beverage;
import Decorate.correctCode.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int cost() {
        return 3 + beverage.cost();
    }
}
