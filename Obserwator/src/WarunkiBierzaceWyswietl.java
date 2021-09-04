public class WarunkiBierzaceWyswietl implements Obserwator, WyswietlElement {
    private float temperatura;
    private float wilgotnosc;
    private Podmiot danePogodowe;

    public WarunkiBierzaceWyswietl(Podmiot danePogodowe)
    {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujobserwatora(this);
    }

    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie)
    {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        wyswietl();
    }

    public void wyswietl()
    {
        System.out.println("Warunki bierzace "+temperatura
        + " stopni C oraz "+wilgotnosc+"% wilgotnosc");
    }
}
