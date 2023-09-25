package org.example;

public class Tournament {
    private int entrants;

    private Bracket winners;
    private Bracket losers;

    public int getEntrants() {
        return entrants;
    }

    public void setEntrants(int entrants) {
        this.entrants = entrants;
    }

    public Bracket getWinners() {
        return winners;
    }

    public void setWinners(Bracket winners) {
        this.winners = winners;
    }

    public Bracket getLosers() {
        return losers;
    }

    public void setLosers(Bracket losers) {
        this.losers = losers;
    }
}
