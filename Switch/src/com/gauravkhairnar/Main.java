package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        int i;
        i = 69;

        switch (i){
            case 1:
                System.out.println("1 is selected !");
                break;
            case 2:
                System.out.println("2 is Selected !!");
                break;
            default:
                System.out.println("nor 1 nor 2 is selected!,the number selected is " +i);
                break;

        }

        String s;
        s = "lol";

        switch (s){
            case "hi":
                System.out.println("\nhi is selected !");
                break;
            case "ya":
                System.out.println("\nya is Selected !!");
                break;
            default:
                System.out.println("\nnor hi  nor ya is selected , the word selected is " + s);
                break;
        }

        String month;
        month = "FebRuary";
        switch(month.toLowerCase()){
            case "january":
                System.out.printf("\nThe month is Jan");
                break;
            case "february":
                System.out.printf("\nTHe month is Feb");
                break;
            default:
                System.out.printf("\nNeither January Nor February was detected the month detected was " +month);
                break;
        }
    }
}
