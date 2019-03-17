package com.gauravkhairnar;

import java.util.Scanner;

public class Main {

    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getArray();
       // myArray = getArray();
        printSortedArray(myArray);

    }

    private static int[] getArray(){
        System.out.println("Enter the number of elements in your array ");
        int n = myScanner.nextInt();  //Here we have to use the name for the scanner we defined above in the scanner class
        int[] myArray1 = new int[n];
        for(int i = 0; i<n; i++) {
            myArray1[i] = myScanner.nextInt();
        }
        return myArray1;
    }
    private static void printSortedArray(int[] someArray){
        int l = someArray.length;
      //  int[] sortedArray = someArray;
        int temp  = 0;

        for(int u = 0;u<l-1;u++){
            for(int i = 0; i<l-1;i++){
                if(someArray[i] < someArray[i+1]){
                    temp = someArray[i+1];
                    someArray[i+1] = someArray[i];
                    someArray[i] = temp;

                }
            }
        }

        System.out.println("The sorted array is :");
        for(int p = 0; p < l;p++){
            System.out.println(+someArray[p]);
        }
    }

}
