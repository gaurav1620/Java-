package com.gauravkhairnar;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int draw = 0;

    private ArrayList<T> playerList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T p) {
        if (playerList.contains(p)) {
            System.out.println(p.getName() + " already in team.");
            return false;
        } else {
            System.out.println(p.getName() + " is added in team.");
            playerList.add(p);
            return true;
        }
    }

    public int numPlayers() {
        return this.playerList.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            this.won++;
        } else if (ourScore == theirScore) {
            this.draw++;
        } else {
            this.lost++;
        }
        this.played++;

        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int points() {
        return ((won * 2) + draw);
    }
}
