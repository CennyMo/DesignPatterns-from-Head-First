package Decorate.BadCode2.Beverages;

import Decorate.BadCode2.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(String des) {
        this.description = des;
    }

    @Override
    public int cost() {
        return (super.cost()) + 10;
    }
}
