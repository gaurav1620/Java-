package com.gauravkhairnar;

public class Room {


    public Furniture theFurniture;
    public Bed theBed;

//    Table theTable = new Table(33,44,false,"wood");
//    Furniture theFurniture  = new Furniture(theTable,3000,40,"Woodland",
//            new Cupboard(3,false,"Neelkamal",4));
//
//    Coution theCoution = new Coution(40,5,"FinePillows");
//


    public Room(Furniture theFurniture, Bed theBed) {
        this.theFurniture = theFurniture;
        this.theBed = theBed;
    }

    public Furniture getTheFurniture() {
        return theFurniture;
    }

    public Bed getTheBed() {
        return theBed;
    }

}
