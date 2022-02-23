package Pizzeria;
import Pizza.Pizza;
import Pizza.WloskaSerowaPizza;

public class WloskaPizzeria extends Pizzeria {
    
    @Override
    protected Pizza utworPizza(String type) {
        if(type.equals("serowa"))
            return new WloskaSerowaPizza();
        return null;
    }
}
