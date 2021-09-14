package Dodatki;

import Dekorator.SkladnikDekorator;
import Dostarczone.Napoj;

public class BitaSmietana extends SkladnikDekorator {

    Napoj napoj;

    public BitaSmietana(Napoj napoj)
    {
        this.napoj = napoj;
    }

    public String pobierzOpis()
    {
        return napoj.pobierzOpis() + ", Bita Smietana";
    }

    public double koszt()
    {
        return napoj.koszt() + 0.20;
    }
}
