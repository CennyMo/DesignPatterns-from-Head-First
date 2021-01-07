package Decorate.BadCode.Beverages;

import Decorate.BadCode.Beverage;

public class Decaf extends Beverage {
    public Decaf(String des) {
        this.description = des;
    }

    @Override
    public int cost() {
        return 20;
    }
}
