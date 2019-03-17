package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        Mustang myCar = new Mustang("Cobra",60);
        myCar.accelerate(20);
        System.out.println("The car has "+myCar.getCylinders()+" cylinder");

    }
}
