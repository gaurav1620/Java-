package com.gauravkhairnar;

public class Monitor {
    private Resolution reso;
    private String model;
    private Boolean touchScreen;
    private int size;


    public Monitor(Resolution reso, String model, Boolean touchScreen, int size) {
        this.reso = reso;
        this.model = model;
        this.touchScreen = touchScreen;
        this.size = size;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing Pixel at " + x + " ," + y + " of " + color + " color ...");
    }

    public Resolution getReso() {
        return reso;
    }

    public String getModel() {
        return model;
    }

    public Boolean getTouchScreen() {
        return touchScreen;
    }

    public int getSize() {
        return size;
    }
}

