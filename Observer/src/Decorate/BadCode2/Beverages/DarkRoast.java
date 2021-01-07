package Decorate.BadCode2.Beverages;

import Decorate.BadCode2.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(String des) {
        this.description = des;
    }

    @Override
    public int cost() {
        return (super.cost()) + 30;
    }
}
