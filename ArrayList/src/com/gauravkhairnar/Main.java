package com.gauravkhairnar;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
   // private GrocceryList myGrocceryList = new GrocceryList();
    private static void printInstructions(){
        System.out.println("\n0. Quit");
        System.out.println("1. Add Groccery Item");
        System.out.println("2. Print Groccery list");
        System.out.println("3. Delete Groccery item by its name");
        System.out.println("4. Find serial number of the groccery item");
        System.out.println("5. Delete Groccery item by its serial number\n");
    }
    public static void main(String[] args) {
        GrocceryList g1 = new GrocceryList();
        boolean quit = false;
        int choice = 0;
        while(!quit){
            printInstructions();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    String a;
                    System.out.println("Enter the item to be added: ");
                    a = scanner.next();
                    g1.addGrocceryItem(a);
                    break;
                case 2:
                    System.out.println("Your Grocery list is: ");
                    g1.printGrocceryList();
                    break;
                case 3:
                    System.out.println("Enter the name of item to be removed: ");
                    String r = scanner.nextLine();
                    int q = g1.getIndex(r);
                    g1.removeGrocceryItem(q);
                    break;
                case 4:
                    System.out.println("Enter the item to be searched for: ");
                    String s = scanner.nextLine();
                    System.out.println("The serial number of "+s+" is "+(g1.getIndex(s)+1));
                    break;
                case 5:
                    System.out.println("Enter the serial number of item to be deleted");
                    int t = scanner.nextInt();
                    g1.removeGrocceryItem(t);
                    break;
            }
        }
    }
}
