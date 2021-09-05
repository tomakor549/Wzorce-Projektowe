import java.util.ArrayList;
import java.util.Observable;

public class DanePogodowe extends Observable {
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe(){ }

    public void odczytyZmiana(){
        setChanged();
        notifyObservers();
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie)
    {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }

    public float pobierzTemperature(){
        return temperatura;
    }

    public float pobierzWilgotnosc(){
        return wilgotnosc;
    }

    public float pobierzCisnienie(){
        return cisnienie;
    }
}
