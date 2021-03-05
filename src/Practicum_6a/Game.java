package Practicum_6a;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double oudePrijs;
    public double nieuwprijs;

    public Game(String nm, int rJ,double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
        oudePrijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int huidigJaar = LocalDate.now().getYear();
        double macht = huidigJaar - releaseJaar;
        return nieuwprijs = nieuwprijs * (Math.pow(0.70, macht));
    }

    public boolean equals(Object andereObject) {
        return (this.naam == ((Game)andereObject).naam && this.releaseJaar == ((Game)andereObject).releaseJaar);
    }

    public String toString() {
        String prijs = String.format("%.2f",nieuwprijs);
        return naam + ", uitgegeven in " +releaseJaar + "; nieuwprijs: €" + String.format("%.2f",oudePrijs) + " nu voor: €" + prijs;
    }
}
