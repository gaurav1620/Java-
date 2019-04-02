package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {


        Password p1 = new Password(942307);

        
        System.out.println(p1.letMeIn(12345));
        System.out.println(p1.letMeIn(0));
        System.out.println(p1.letMeIn(-11));
        System.out.println(p1.letMeIn(942307));
    }
}
