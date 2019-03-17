package com.gauravkhairnar;

public class Case {
    private String manufacturer;
    private String model;
    private Dimensions dimentions;

    public Case(String manufacturer, String model, Dimensions dimentions) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dimentions = dimentions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDimentions() {
        return dimentions;
    }
}
