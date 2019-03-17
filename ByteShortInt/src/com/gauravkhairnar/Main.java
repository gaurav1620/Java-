package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        //int has a width of 32
        int minintval = -2147483648;    /// the number can be more readable by 2_147_483_648
        int maxintval = 2147483647;
        int mytotalint = (minintval/2);
        System.out.println("My int total " + mytotalint);

        // byte has a width of 8
        byte minbytval = -128;
        byte maxbyteval = 127;
        /* byte mytotalbyte = (minbytval/2);  we cannot use this and it  will give an error
                                                 because java makes minbyteval/2 = -64 an int
                                                  by default , so to correct this error we use
                                                  '(byte)' before minbyteval/2 to declare it as a byte.*/
        byte mytotalbyte =(byte) (minbytval/2);

        // short has a width of 16
        short minshortval = -32768;
        short maxshortval = 32767;

        long along = 420L;   // we need a L after the number the value for a long

        int c   = 50;
        byte a  = 10;
        short b = 20;
        long total = 50000L + 10*(a + b + c); //long will accept an int for calculations!!
        System.out.println("Total: " + total);


    }
}
