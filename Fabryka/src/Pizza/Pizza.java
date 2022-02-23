package Pizza;

import java.util.ArrayList;

public abstract class Pizza{
    String nazwa;
    String ciasto;
    String sos;
    ArrayList<String> dodatki = new ArrayList<String>();
    
    public void przygotowanie(){
        System.out.println("Przygotowanie "+nazwa);
        System.out.println("Wyrabianie ciasta...");
        System.out.println("Dodawanie sosu... ");
        System.out.println("Dodatki:");
        for(int i = 0; i<dodatki.size();i++){
            System.out.println("- "+dodatki.get(i));
        }
    }

    public void pieczenie(){
        System.out.println("Pieczenie!");
    }

    public void krojenie(){
        System.out.println("Rach ciach pizzo! zmień się w trójkąty");
    }

    public void pakowanie(){
        System.out.println("hop do pudła");
    }

    public String pobierzNazwa(){
        return nazwa;
    }
}