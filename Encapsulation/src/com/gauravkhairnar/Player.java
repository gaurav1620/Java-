package com.gauravkhairnar;

public class Player {
    private int hitPoints = 100; //default value
    private String name;
    private String weapon;

    public void loseHealth(int lostHealth){
        this.hitPoints -=  lostHealth;
        System.out.println("The new hitPoints of the player is " +this.getHealth());
    }


    public Player(int hitPoints, String name, String weapon) {
        if (hitPoints >= 0 && hitPoints <= 100){
            this.hitPoints = hitPoints;
        }
        this.name = name;
        this.weapon = weapon;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }


}
