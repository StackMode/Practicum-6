package Practicum_6a;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ,double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }
    public double huidigeWaarde() { return nieuwprijs = nieuwprijs * (0.70 * releaseJaar);}

    public boolean equals(Object andereObject) {
        ;
    }

    public String toString() {
        String prijs = String.format("%.2f",nieuwprijs);
        return naam + ", uitgegeven in " +releaseJaar + "; nieuwprijs: " + prijs;
    }
}
