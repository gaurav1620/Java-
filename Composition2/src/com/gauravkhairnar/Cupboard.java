package com.gauravkhairnar;

public class Cupboard {
    private int drawers;
    private Boolean mirror;
    private  String manufacturer;
    private int shelfs;

    public Cupboard(int drawers, Boolean mirror, String manufacturer, int shelfs) {
        this.drawers = drawers;
        this.mirror = mirror;
        this.manufacturer = manufacturer;
        this.shelfs = shelfs;
    }

    public int getDrawers() {
        return drawers;
    }

    public Boolean getMirror() {
        return mirror;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getShelfs() {
        return shelfs;
    }
}
