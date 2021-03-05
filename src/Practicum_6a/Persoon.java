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
        if (mijnGames.contains(g)) {
            return false; }
        else if (g.huidigeWaarde() > budget){
            return false;}
        else {
            budget -= g.nieuwprijs;;
            mijnGames.add(g);
            return true;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (!(this.mijnGames.contains(g))) {
            return false;
        }
        else if (koper.mijnGames.contains(g) || g.nieuwprijs > koper.budget) {
            return false;
        }
        else {
            koper.budget -= g.nieuwprijs;
            this.budget += g.nieuwprijs;
            this.mijnGames.remove(g);
            koper.mijnGames.add(g);
            return true;
        }
    }
    public ArrayList bepaalGamesNietInBezit(ArrayList<Game> lijst){
        ArrayList filterlijst = new ArrayList();
        for (Game g : mijnGames){
            for(Game spel : lijst){
                if (!(spel.equals(g))){
                    filterlijst.add(spel);
                }
            }
        }
        return filterlijst;
    }
    public String toString() {
        String bud = String.format("%.2f", budget);
        String games = "";
        for(Game game : mijnGames) {
            games += "\n" + game.toString();

        }
        return naam + " heeft een budget van €" + bud + " en bezit de volgende games:" + games;
    }
}
