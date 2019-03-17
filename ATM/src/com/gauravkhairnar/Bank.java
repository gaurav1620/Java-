package com.gauravkhairnar;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private static Scanner scanner = new Scanner(System.in);
    private String name;
    ArrayList<Account> accList = new ArrayList<Account>();

    public void addAccount(){
        //System.out.println("**********************");
        System.out.println("Enter your full name:");
        String n = scanner.next();
        System.out.println("Enter your pin: (4 digit integer)");
        int p = scanner.nextInt();
        int g = (accList.size()+1);
        System.out.println("Your account number is :"+ g);
        System.out.println("Congrats "+n+" your account has been created successfully!");
        Account newAcc = new Account();
        newAcc.setName(n);
        newAcc.setAccountNumber(g);
        newAcc.setPin(p);
        newAcc.setBalance(0);
        accList.add(newAcc);
        System.out.println("**********************");
    }
    public void changePin(){
        //System.out.println("**********************");
        int a  =  checkPassAndGetAccNo();
        if(a > 0){
            System.out.println("Enter new PIN : ");
            int p = scanner.nextInt();
            accList.get(a-1).setPin(p);
            System.out.println("PIN changed Successfully!!");
        }

        System.out.println("**********************");
    }
    public int checkPassAndGetAccNo(){
       // System.out.println("**********************");
        System.out.println("Enter your account number: ");
        int  a = scanner.nextInt();
        if(a <= accList.size()&&a>0){
            System.out.println("Enter your PIN:");
            int p = scanner.nextInt();
            Account test  = new Account();
            test.setPin(p);
            test.setAccountNumber(a);
            if(test.getPin() == accList.get(a-1).getPin()){
                System.out.println("Pin Verified!");
              //  System.out.println("**********************");
                return a;
            }else{
                System.out.println("Wrong PIN! :(");
             //   System.out.println("**********************");
                return -1;
            }
        }else{
            System.out.println("Account number does not exist! :(");
          //  System.out.println("**********************");
            return -1;
        }

    }
    public void deposit(){
       // System.out.println("**********************");
        int x = checkPassAndGetAccNo();
        if(x == -1){
            System.out.println("**********************");
            return;
        }else{
            System.out.println("Enter the amount to be deposited: ");
            int dep = scanner.nextInt();
            int bal = accList.get(x-1).getBalance();
            bal += dep;
            accList.get(x-1).setBalance(bal);
            System.out.println("Transaction Successfull!");
        }
        System.out.println("**********************");
    }
    public void withdraw(){
   //     System.out.println("**********************");
        int x = checkPassAndGetAccNo();
        if(x == -1){
            System.out.println("**********************");
            return;
        }else{
            System.out.println("Enter the amount you wish to withdraw: ");
            int dep = scanner.nextInt();
            int bal = accList.get(x-1).getBalance();
            bal -= dep;
            accList.get(x-1).setBalance(bal);
            System.out.println("Transaction successfull!");
        }
        System.out.println("**********************");
    }
    public void showBalance(){
        int y = checkPassAndGetAccNo();
        System.out.println("Your balance is "+accList.get(y-1).getBalance());
    }
}

