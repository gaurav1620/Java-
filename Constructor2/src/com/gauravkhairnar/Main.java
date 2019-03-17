package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {

        VIpCustomer Gaurav = new VIpCustomer();
        VIpCustomer Rohan  = new VIpCustomer("Rohan",3000);
        VIpCustomer Mahesh = new VIpCustomer("Mahesh",5000,"Mahesh@jio.com");

        Gaurav.getName();
        Gaurav.getCreditLimit();
        Gaurav.getEmail();

        Rohan.getName();
        Rohan.getCreditLimit();
        Rohan.getEmail();

        Mahesh.getName();
        Mahesh.getCreditLimit();
        Mahesh.getEmail();
    }
}
