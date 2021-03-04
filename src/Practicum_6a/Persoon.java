package Practicum_6a;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<>();


    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (g.huidigeWaarde() < budget)

            return true;
        else
            return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
       if(g.huidigeWaarde() < koper.getBudget())
           return true;
       else
           return false;
    }

    public String toString() {
        return naam + " heeft een budget van " + budget + " en bezit de volgende games:\n " + mijnGames;
    }
}
