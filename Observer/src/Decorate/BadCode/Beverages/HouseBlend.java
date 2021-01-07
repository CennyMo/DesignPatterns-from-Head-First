package Decorate.BadCode.Beverages;

import Decorate.BadCode.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(String des) {
        this.description = des;
    }

    @Override
    public int cost() {
        return 10;
    }
}
