package com.gauravkhairnar;

public class Mustang extends Car {

    private int releaseYear;
    private String model;
    private int handling;

    public Mustang( int aceessibility, int speed, int gears, int topSpeed, int acceleration, int releaseYear, int handling) {
        super("Road", aceessibility, speed, "Ford", gears, topSpeed, acceleration);
        this.releaseYear = releaseYear;
        this.model = "Mustang";
        this.handling = handling;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getModel() {
        return model;
    }

    public int getHandling() {
        return handling;
    }
}
