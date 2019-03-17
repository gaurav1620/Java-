package com.gauravkhairnar;

public class Resolution {
    private int pixelLength;
    private int pixelWidth;

    public Resolution(int pixelLength, int pixelWidth) {
        this.pixelLength = pixelLength;
        this.pixelWidth = pixelWidth;
    }

    public int getPixelLength() {
        return pixelLength;
    }

    public int getPixelWidth() {
        return pixelWidth;
    }
}
