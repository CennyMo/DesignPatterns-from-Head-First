package Decorate.BadCode2;

import Decorate.BadCode2.Beverages.DarkRoast;
import Decorate.BadCode2.Beverages.Decaf;
import Decorate.BadCode2.Beverages.HouseBlend;

public class test {
    public static void main(String args[]){
        DarkRoast darkRoast = new DarkRoast("It's a darkrost");
        Decaf decaf = new Decaf("It's a decaf");
        HouseBlend houseBlend = new HouseBlend("It's a houseblend");

        darkRoast.setMilk(true);
        decaf.setMocha(true);
        houseBlend.setSoy(true);

        System.out.println(darkRoast.getDescription() + " " + darkRoast.cost());
        System.out.println(decaf.getDescription() + " " + decaf.cost());
        System.out.println(houseBlend.getDescription() + " " + houseBlend.cost());
    }
}
