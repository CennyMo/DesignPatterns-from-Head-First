package Decorate.BadCode2.Beverages;

import Decorate.BadCode2.Beverage;

public class Decaf extends Beverage {
    public Decaf(String des) {
        this.description = des;
    }

    @Override
    public int cost() {
        return (super.cost()) + 20;
    }
}
