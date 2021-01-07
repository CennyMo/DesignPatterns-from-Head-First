package Decorate.BadCode.Beverages;

import Decorate.BadCode.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(String des) {
        this.description = des;
    }

    @Override
    public int cost() {
        return 30;
    }
}
