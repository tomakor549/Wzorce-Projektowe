import java.util.Observable;
import java.util.Observer;

public class WarunkiBierzaceWyswietl implements Observer, WyswietlElement {
    private float temperatura;
    private float wilgotnosc;
    Observable observable;

    public WarunkiBierzaceWyswietl(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }
  
    public void update(Observable obs, Object arg)
    {
        if(obs instanceof DanePogodowe){
            DanePogodowe danePogodowe = (DanePogodowe)obs;
            this.temperatura = danePogodowe.pobierzTemperature();
            this.wilgotnosc = danePogodowe.pobierzWilgotnosc();
            wyswietl();
        }
    }

    public void wyswietl()
    {
        System.out.println("Warunki bierzace "+temperatura
        + " stopni C oraz "+wilgotnosc+"% wilgotnosc");
    }
}
