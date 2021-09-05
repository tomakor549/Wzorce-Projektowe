import java.util.Observable;
import java.util.Observer;

public class IndexCiepla implements Observer, WyswietlElement {
    private float indeksCiepla;
    Observable observable;

    public IndexCiepla(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }
  
    public void update(Observable obs, Object arg)
    {
        if(obs instanceof DanePogodowe){
            DanePogodowe danePogodowe = (DanePogodowe)obs;
            this.indeksCiepla = przeliczIndeksCiepla(danePogodowe.pobierzTemperature(), danePogodowe.pobierzWilgotnosc());
            wyswietl();
        }
    }
   
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie)
    {
    }

    private float przeliczIndeksCiepla(float t, float rh) {
        float indeks =  (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) 
        + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) 
        + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
        (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * 
        (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) + 
        (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
        0.000000000843296 * (t * t * rh * rh * rh)) -
        (0.0000000000481975 * (t * t * t * rh * rh * rh)));

        return indeks;
    }

    public void wyswietl()
    {
        System.out.println("Obliczony index ciepla ma wartosc: " + indeksCiepla);
    }
    
}
