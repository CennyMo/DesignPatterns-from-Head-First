package Decorate.correctCode.Coffee;

import Decorate.correctCode.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public int cost() {
        return 16;
    }
}
