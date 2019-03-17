package com.gauravkhairnar;

public class Table {
    private int height;
    private  int width;
    private boolean round;
    private String material;


    public Table(int height, int width, boolean round, String material) {
        this.height = height;
        this.width = width;
        this.round = round;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isRound() {
        return round;
    }

    public String getMaterial() {
        return material;
    }

}
