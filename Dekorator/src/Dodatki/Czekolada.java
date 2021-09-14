package Dodatki;

import Dekorator.SkladnikDekorator;
import Dostarczone.Napoj;

public class Czekolada extends SkladnikDekorator {
    
    Napoj napoj;

    public Czekolada(Napoj napoj)
    {
        this.napoj = napoj;
    }

    public String pobierzOpis()
    {
        return napoj.pobierzOpis() + ", Czekolada";
    }

    public double koszt()
    {
        return napoj.koszt() + 0.20;
    }
}
