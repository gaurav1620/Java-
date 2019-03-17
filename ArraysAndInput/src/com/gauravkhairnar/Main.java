package com.gauravkhairnar;

import java.util.Scanner;

public class Main {
    //this is a predefined java.lang package
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myIntArray0 = new int[10];    //these are diff ways to initialize an array
        int[] myIntArray1 = {1,2,3,4};

        int[] myIntArray2 = getElelments(6);  //this way is used to input an array
        printArray(myIntArray2);
        System.out.println("The average is "+average(myIntArray2));

    }
    private static void printArray(int[] anyArray){
        //array.length is an integrated function
        for(int i=0; i<anyArray.length; i++){
            System.out.println("The "+i+ " element is "+anyArray[i]);
        }
    }
    private static int[] getElelments(int n){

        int[] anArray = new int[n];
        System.out.println("Enter "+n+" numbers");
        for(int j = 0; j<n ;j++){
            anArray[j] = scanner.nextInt();     //Use of scanner statement
        }
        return anArray;
    }
    private static float average(int[] someArray){
        float sum = 0;
        for(int k = 0; k<someArray.length; k++){
            sum += (float)someArray[k];
        }
        return sum/someArray.length;
    }
}
