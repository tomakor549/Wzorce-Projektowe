import Pizza.Pizza;
import Pizzeria.AmerykanskaPizzeria;
import Pizzeria.Pizzeria;
import Pizzeria.WloskaPizzeria;

public class PizzaTest {
    public static void main(String[] args) throws Exception {
        Pizzeria wloska = new WloskaPizzeria();
        Pizzeria amerykanska = new AmerykanskaPizzeria();
        Pizza pizza;

        pizza = wloska.zamowPizza("serowa");
        if (pizza != null)
            System.out.println(pizza.pobierzNazwa() + " dla Eryka gotowa!\n");
        else
            System.out.println("Nie ma Pizzy dla Eryka\n");

        pizza = amerykanska.zamowPizza("serowa");
        if (pizza != null)
            System.out.println(pizza.pobierzNazwa() + " dla Jacka gotowa!\n");
        else
            System.out.println("Nie ma Pizzy dla Jacka\n");
    }
}
