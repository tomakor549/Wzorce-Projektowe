package Pizzeria;

import Pizza.AmerykanskaSerowaPizza;
import Pizza.Pizza;

public class AmerykanskaPizzeria extends Pizzeria {
    
    @Override
    protected Pizza utworPizza(String type) {
        if(type.equals("serowa"))
            return new AmerykanskaSerowaPizza();
        return null;
    }
}
