package Dostarczone;

public abstract class Napoj {
    protected String opis = "Napój nieznany";

    public String pobierzOpis(){
        return opis;
    }

    public abstract double koszt();
}
