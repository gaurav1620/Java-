package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        Player player = new Player(200,"PlAyErNaMe","Sword");

        //here we are restricting any unauthorised access to the hitPoints by renaming the var health to hitPoints
        // and making the hitPoints as private .
        System.out.println("THe health of the Player is "+player.getHealth());

        player.loseHealth(20);

    }
}
