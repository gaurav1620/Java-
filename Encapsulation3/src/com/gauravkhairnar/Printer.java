package com.gauravkhairnar;

public class Printer {
    private int tonerLevel = 50;  //default
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if(tonerLevel < 100){
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int fill){
        if (this.tonerLevel+fill < 100 ){
            this.tonerLevel += fill;
        }
    }

    public void showDetails(){
        System.out.println("The Printer has currently printed "+this.pagesPrinted+" and has a toner level of "+this.tonerLevel);
    }

    public void printPages(int noOfPages){
        this.pagesPrinted += noOfPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
