package Decorate.correctCode.Coffee;

import Decorate.correctCode.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public int cost() {
        return 20;
    }
}
