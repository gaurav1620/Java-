package com.gauravkhairnar;

public class Vehicle {
    private String medium;
    private int aceessibility;
    private int speed;

    public Vehicle(String medium, int aceessibility, int speed) {
        this.medium = medium;
        this.aceessibility = aceessibility;
        this.speed = speed;
    }

    public void changeSpeed(int speed){
        this.speed += speed;
        System.out.println("the speed of the vehicle is "+this.speed+" m/s");
    }

    public String getMedium() {
        return medium;
    }

    public int getAceessibility() {
        return aceessibility;
    }

    public int getSpeed() {
        return speed;
    }
}
