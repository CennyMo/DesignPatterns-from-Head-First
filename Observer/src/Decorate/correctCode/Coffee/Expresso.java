package Decorate.correctCode.Coffee;

import Decorate.correctCode.Beverage;

public class Expresso extends Beverage {
    public Expresso() {
        description = "Expresso";
    }

    @Override
    public int cost() {
        return 15;
    }
}
