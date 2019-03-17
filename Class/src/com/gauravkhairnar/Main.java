package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        Car lambo = new Car();

        porche.setModel("CarReRa");
        lambo.setModel("CouNtAcH");
        System.out.println("the Model Of the car is " + porche.getModel());
        System.out.println("the Model Of the car is " + lambo.getModel());

    }
}
