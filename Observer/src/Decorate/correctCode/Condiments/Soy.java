package Decorate.correctCode.Condiments;

import Decorate.correctCode.Beverage;
import Decorate.correctCode.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int cost() {
        return 1 + beverage.cost();
    }
}
