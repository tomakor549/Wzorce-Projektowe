import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
    public ArrayList<Obserwator> obserwatorzy;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe(){
        obserwatorzy = new ArrayList<Obserwator>();
    }

    public void zarejestrujobserwatora(Obserwator o){
        obserwatorzy.add(o);
    }

    public void usunObserwatora(Obserwator o){
        int i = obserwatorzy.indexOf(o);
        if(i>=0){
            obserwatorzy.remove(i);
        }
    }

    public void powiadomObserwatorow(){
        for (Obserwator obserwator : obserwatorzy) {
            obserwator.aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }

    public void odczytyZmiana(){
        powiadomObserwatorow();
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie)
    {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }
}
