package com.gauravkhairnar;

public class Car extends Vehicle{

    private String brand;
    private int gears;
    private int topSpeed;
    private int acceleration;


    public Car(String medium, int aceessibility, int speed, String brand, int gears, int topSpeed, int acceleration) {
        super("Road", aceessibility, speed);
        this.brand = brand;
        this.gears = gears;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public void changeGear(int n){
        this.gears = n;
        System.out.println("the car is in "+this.gears+" gear");
    }

    public String getBrand() {
        return brand;
    }

    public int getGears() {
        return gears;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

}
