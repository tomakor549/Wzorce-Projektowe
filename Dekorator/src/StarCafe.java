import Dodatki.BitaSmietana;
import Dodatki.Czekolada;
import Dostarczone.Napoj;
import Napoje.*;

public class StarCafe {
    public static void main(String[] args) {
        Napoj zamowienie = new Espresso();
        printOpis(zamowienie);

        Napoj zamowienie2 = new MocnoPalona();

        zamowienie2 = new Czekolada(zamowienie2);
        zamowienie2 = new Czekolada(zamowienie2);
        zamowienie2 = new BitaSmietana(zamowienie2);
        printOpis(zamowienie2);
        
        Napoj zamowienie3 = new StarCafeSpecial();

        zamowienie3 = new Czekolada(zamowienie3);
        zamowienie3 = new Czekolada(zamowienie3);
        zamowienie3 = new BitaSmietana(zamowienie3);
        printOpis(zamowienie3);
    }

    public static void printOpis(Napoj zamowienie)
    {
        System.out.print(zamowienie.pobierzOpis() + " "); 
        System.out.format("%.2f zł\n", zamowienie.koszt());
    }
}
