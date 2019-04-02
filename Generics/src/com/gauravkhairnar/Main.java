package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer bob = new BaseballPlayer("Bob");
        SoccerPlayer tim = new SoccerPlayer("Tim");

        Team<FootballPlayer> myTeam = new Team<>("India");
        myTeam.addPlayer(joe);
      //  myTeam.addPlayer(bob);  //bob cannot be added in football team
      //  myTeam.addPlayer(tim);  //tim cannot be added in football team

        System.out.println(myTeam.numPlayers());
    }
}
