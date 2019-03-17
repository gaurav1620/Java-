package com.gauravkhairnar;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Bank bank = new Bank();
        boolean quit = false;
        int choice;
        signature();
        showOptions();
        while(!quit){

            System.out.println("\nEnter your choice:             (press 6 for options)");
            choice = scanner.nextInt();
            switch (choice){
                case 0:
                    quit = true;
                    signature();
                    break;
                case 1:
                    bank.withdraw();
                    break;
                case 2:
                    bank.deposit();
                    break;
                case 3:
                    bank.showBalance();
                    break;
                case 4:
                    bank.changePin();
                    break;
                case 6:
                    showOptions();
                    break;
                case 5:
                    bank.addAccount();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    System.out.println("********************");
                    break;
            }
        }
    }
    public static void showOptions(){
        System.out.println(" _______ATM_______");
        System.out.println("|0. Exit the ATM. |");
        System.out.println("|1. Withdraw Cash |");
        System.out.println("|2. Deposit Cash  |");
        System.out.println("|3. Show Balance  |");
        System.out.println("|4. Change PIN    |");
        System.out.println("|5. Create Account|");
        System.out.println("|_________________|");
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
