package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        Dimensions theDimensions = new Dimensions(22,33,23);

        Case theCase = new Case("Asus","csm22",theDimensions);

        // Here we Create resolution class in monitor directly;
        Monitor theMonitor = new Monitor(new Resolution(300,200),"sony",false,33);

        Motherboard theMotherboard = new Motherboard("acer","someone",6,"Grub69");

        PC thePC = new PC(theMotherboard,theMonitor,theCase);

        thePC.getTheMonitor().drawPixel(200,222,"Red");
        thePC.getTheMotherboard().loadProgram("Game");

    }
}
