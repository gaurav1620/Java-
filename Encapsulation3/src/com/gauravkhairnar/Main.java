package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
	    Printer myPrinter = new Printer(200,34,true);

        myPrinter.showDetails();

        myPrinter.fillToner(-10);
        myPrinter.showDetails();
    }
}
