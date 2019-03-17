package com.gauravkhairnar;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int  cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cardSlots = cardSlots;
        this.bios = bios;


    }

    public void loadProgram(String x){
        System.out.println("The " +x + " program is loading ..." );
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int  getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
