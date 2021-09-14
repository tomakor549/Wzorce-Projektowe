package Napoje;
import Dostarczone.Napoj;

public class Espresso extends Napoj {

    public Espresso()
    {
        opis = "Kawa espresso";
    }

    public double koszt() {
        return 1.99;
    }
}
