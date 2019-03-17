package com.gauravkhairnar;

import java.util.Scanner;

public class Main {
private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        signature();
        printOptions();
        Mobile mob = new Mobile();
        boolean leave = false;
        while(!leave){

            System.out.println("Enter your choice: (press 4 for options)");
            int choice = scanner.nextInt();
            switch(choice){
                case 0:
                    System.out.println(" Made By :");
                    signature();
                    leave = true;
                    break;
                case 1:
                    mob.addContact();
                    break;
                case 2:
                    mob.delContact();
                    break;
                case 3:
                    mob.searchByName();
                    break;
                case 4:
                    printOptions();
                    break;
               case 5:
                    mob.printContacts();
                    break;
                case 6:
                    mob.updateContact();
                    break;
                case 9:
                    printOptions();
                default:
                    System.out.println("Invalid Choice !!! ");
            }
        }
    }
    public static void printOptions(){
        System.out.println(" ___________________________");
        System.out.println("|          |*SONY*|        |");
        System.out.println("|PRESS:                    |");
        System.out.println("| 0 - Exit the programe    |");
        System.out.println("| 1 - Add new contact      |");
        System.out.println("| 2 - Delete contact       |");
        System.out.println("| 3 - Search by name       |");
        System.out.println("| 4 - Show Options         |");
        System.out.println("| 5 - Print contact list   |");
        System.out.println("| 6 - Update contact       |");
        System.out.println("|__________________________|");
    }
    public static void signature(){
        System.out.println("   ______                            \n" +
                "  / ____/___ ___  ___________ __   __\n" +
                " / / __/ __ `/ / / / ___/ __ `/ | / /\n" +
                "/ /_/ / /_/ / /_/ / /  / /_/ /| |/ / \n" +
                "\\____/\\__,_/\\__,_/_/   \\__,_/ |___/  \n");
        System.out.println("    __ __ __          _                      \n" +
                "   / //_// /_  ____ _(_)________  ____ ______\n" +
                "  / ,<  / __ \\/ __ `/ / ___/ __ \\/ __ `/ ___/\n" +
                " / /| |/ / / / /_/ / / /  / / / / /_/ / /    \n" +
                "/_/ |_/_/ /_/\\__,_/_/_/  /_/ /_/\\__,_/_/     \n");
    }
}
