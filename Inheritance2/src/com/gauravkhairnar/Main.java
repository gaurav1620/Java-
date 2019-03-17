package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        Mustang v81950 = new Mustang(3,43,4,344,34343,333,4);
        v81950.changeGear(3);
        System.out.println("the handling of the V81950 is "+v81950.getHandling());
        System.out.println("the Brand is "+v81950.getBrand());
    }
}
