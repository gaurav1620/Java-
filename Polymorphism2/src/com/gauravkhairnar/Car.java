package com.gauravkhairnar;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private int speed;

    public Car(String name,int cylinders, int speed) {
        this.engine = true;         //Fixed
        this.cylinders = cylinders;
        this.wheels = 4;            //Fixed
        this.name = name;
        this.speed = speed;
    }

    public void startEngine(){
        System.out.println("The engine is being started");
    }
    public void accelerate (int a){
        this.speed += a;
        System.out.println("The speed of vehicle has increased from " +(int)(this.speed - a)+" to "+this.speed);
    }
    public void brakes(int b){
        this.speed -= b;
        System.out.println("The speed of vehicle has reduced from " +(int)(this.speed + b)+" to "+this.speed);
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}
