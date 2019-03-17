package com.gauravkhairnar;

public class Furniture {
    private Table theTable;
    private int weight;
    private int occupiedPercentage;
    private String supplyer;
    private Cupboard theCupboard;

    public Furniture(Table theTable, int weight, int occupiedPercentage, String supplyer, Cupboard theCupboard) {
        this.theTable = theTable;
        this.weight = weight;
        this.occupiedPercentage = occupiedPercentage;
        this.supplyer = supplyer;
        this.theCupboard = theCupboard;
    }

    public void showOccupiedPercentage(){
        System.out.println("The Furniture ocuupies " +occupiedPercentage + " percentage of the room!!");
    }

    public Table getTheTable() {
        return theTable;
    }

    public int getWeight() {
        return weight;
    }

    public int getOccupiedPercentage() {
        return occupiedPercentage;
    }

    public String getSupplyer() {
        return supplyer;
    }

    public Cupboard getTheCupboard() {
        return theCupboard;
    }
}
