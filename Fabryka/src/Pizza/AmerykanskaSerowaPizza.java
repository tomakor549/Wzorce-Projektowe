package Pizza;
public class AmerykanskaSerowaPizza extends Pizza {
    public AmerykanskaSerowaPizza(){
        nazwa="Amerykanska Pizza Serowa";
        ciasto = "Extra grube, chrupkie ciasto";
        sos = "SOS pomidory śliwkowe";

        dodatki.add("Grubo tarty ser Mozarella");
    }

    public void krojenie(){
        System.out.println("krojenie pizzy w kwadraty");
    }
    
}
