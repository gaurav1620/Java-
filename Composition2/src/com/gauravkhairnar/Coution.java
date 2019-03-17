package com.gauravkhairnar;

public class Coution {
    private int width;
    private int fluffyness;
    private String brand;

    public Coution(int width, int fluffyness, String brand) {
        this.width = width;
        this.fluffyness = fluffyness;
        this.brand = brand;
    }

    public void showFluffyness(){
        System.out.println("The bed is " +this.fluffyness+" time fluffier than xyz matresses in market");
    }

    public int getWidth() {
        return width;
    }

    public int getFluffyness() {
        return fluffyness;
    }

    public String getBrand() {
        return brand;
    }
}
