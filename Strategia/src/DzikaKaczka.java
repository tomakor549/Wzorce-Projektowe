public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }
    
    void wyswietl() {
        System.out.println("Jestem prawdziwą Dziką Kaczką!");
        
    }
    
}
