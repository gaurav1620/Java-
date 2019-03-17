package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {


//        Gearbox McLaren = new Gearbox(6);
//        //Proper initialization of inner class . We compulsarily need an outer class to make an inner class
//        Gearbox.Gear first = McLaren.new Gear(1,69.420);
//        System.out.println("The drive speed for first gear is --> "+first.driveSpeed(3000));
        Gearbox McLaren = new Gearbox(6);
        McLaren.addGear(1,400);
        McLaren.addGear(2,1100);
        McLaren.addGear(3,1700);
        McLaren.addGear(4,2200);

        McLaren.operateClutch(true);
        McLaren.changeGear(2);

        McLaren.operateClutch(false );
        McLaren.changeGear(3);

        System.out.println(McLaren.getCurrentGear());
        System.out.println(McLaren.wheelSpeed(10));
    }
}
