package com.gauravkhairnar;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn = false;

    //Constructor
    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    //InnerClass
    private class Gear{
        private int gearNumber;
        private double ratio;

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
        public Gear(int gearNumber, double ratio) {  //constructor for gear inner classs
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }
    public int getCurrentGear() {
        return currentGear;
    }


    public void addGear(int gearNumber, double ratio){
        if((gearNumber)>0 && gearNumber<= maxGears){
            Gear newGear = new Gear(gearNumber,ratio);
            gears.add(newGear);
        }
    }

    public void changeGear(int newGear){
        if((newGear>=0) && newGear <= maxGears && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("The gear has been changed to "+ newGear);
        }else{
            System.out.println("Failed to change the gear :(");
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream");
            return 0.0;
        }else{
            return revs * gears.get(currentGear).getRatio();
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

}
