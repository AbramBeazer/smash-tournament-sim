package org.example;

import java.time.LocalDate;
import java.util.List;

public class Set {
    private LocalDate date;
    private List<Game> games;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
