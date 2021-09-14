package Dodatki;

import Dekorator.SkladnikDekorator;
import Dostarczone.Napoj;

public class MleczkoSojowe extends SkladnikDekorator {
    Napoj napoj;

    public MleczkoSojowe(Napoj napoj)
    {
        this.napoj = napoj;
    }
    
    public String pobierzOpis() 
    {
        return napoj.pobierzOpis() + ", Mleczko Sojowe";
    }

    public double koszt() {
        return napoj.koszt() + 0.15;
    }
}
