package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        ITelephone gauPhone ;                                 //old method
        gauPhone = new Deskphone(7744);            //of initializing

        ITelephone mobPhone = new Mobile(9423); //new and more suitable way of initializing

        gauPhone.powerOn();
        gauPhone.callPhone(7744);
        gauPhone.answer();

        mobPhone.powerOn();
        mobPhone.callPhone(9423);
        mobPhone.answer();

    }
}
