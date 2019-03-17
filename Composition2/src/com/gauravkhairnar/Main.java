package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        Table theTable = new Table(33,44,false,"wood");
        Furniture theFurniture  = new Furniture(theTable,3000,40,"Woodland",
                                  new Cupboard(3,false,"Neelkamal",4));
        Coution theCoution = new Coution(40,5,"FinePillows");
        Bed theBed = new Bed(33,33,"errsdds",theCoution);

        Room theRoom = new Room(theFurniture,theBed);

        theRoom.getTheBed().showBedInfo();
        theRoom.getTheFurniture().showOccupiedPercentage();


    }
}
