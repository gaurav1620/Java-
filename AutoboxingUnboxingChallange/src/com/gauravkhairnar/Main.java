package com.gauravkhairnar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Bank> bankList;
    }
    public void addBank(){
        System.out.println("Enter the name of the bank: ");
        String name = scanner.nextLine();
        Bank newBank = new Bank();
        bank

    }
    public int selectBank(){

    }
    public void listBanks(){
        System.out.println("Bank List:");
        for(int i = 0; i< )
    }
    public int bankNum(String randName){
        for(int i = 0;i<bank.size();i++){
            Bank test = bankList.get(i);
            if(test.getBranchCustomers().equals(randName)){
                return i;
            }
        }
        return -1;
    }
}
