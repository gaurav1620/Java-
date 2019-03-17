package com.gauravkhairnar;

public class PC {
    private Motherboard theMotherboard;
    private Monitor theMonitor;
    private Case theCase;

    public PC(Motherboard theMotherboard, Monitor theMonitor, Case theCase) {
        this.theMotherboard = theMotherboard;
        this.theMonitor = theMonitor;
        this.theCase = theCase;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Case getTheCase() {
        return theCase;
    }
}
