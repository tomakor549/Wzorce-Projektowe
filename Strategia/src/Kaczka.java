
public abstract class Kaczka {
    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public Kaczka(){

    }

    abstract void wyswietl();

    public void wykonajLec(){
        latanieInterfejs.lec();
    }

    public void wykonajKwacz(){
        kwakanieInterfejs.kwacz();
    }

    public void plywaj(){
        System.out.println("Wszystkie kaczki pływają, nawet te sztuczne!");
    }
}
