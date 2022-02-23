package Pizzeria;

import Pizza.Pizza;

public abstract class Pizzeria {

    public Pizza zamowPizza(String type) {
        Pizza pizza;

        pizza = utworPizza(type);
        if (pizza == null)
            return null;
        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }

    protected abstract Pizza utworPizza(String type);
}
