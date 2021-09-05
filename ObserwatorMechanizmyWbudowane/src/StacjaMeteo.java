public class StacjaMeteo {
    
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBierzaceWyswietl warunkiBierzaceWyswietl = new WarunkiBierzaceWyswietl(danePogodowe);
        IndexCiepla indexCiepla = new IndexCiepla(danePogodowe);

        danePogodowe.ustawOdczyty(26.6f, 65, 1013.1f);
        danePogodowe.ustawOdczyty(27.7f, 70, 997.0f);
        danePogodowe.ustawOdczyty(25.5f, 90, 997.0f);
    }
}
