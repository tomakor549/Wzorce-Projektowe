package Napoje;
import Dostarczone.Napoj;

public class Bezkofeinowa extends Napoj {
    
    public Bezkofeinowa()
    {
        opis = "Kawa Bezkofeinowa";
    }
    
    public double koszt() {
        return 1.05;
    }
}
