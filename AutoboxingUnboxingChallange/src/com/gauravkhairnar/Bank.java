package com.gauravkhairnar;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private Scanner scanner = new Scanner(System.in);
    public String bankName;
    ArrayList<Branch> bankBranch = new ArrayList<Branch>();

    public void addBranch(){
        System.out.println("Enter the name of new Branch: ");
        String hoo = scanner.nextLine();
        int check = branchNum(hoo);
        if(check == -1){
            Branch b = new Branch();
            bankBranch.add(b);
            System.out.println("Branch added Successfully!! :)");
        }else{
            System.out.println("A branch with similar name is already registered! :(");
        }
    }
    public void removeBranch(){
        System.out.println("Enter the name of Branch to be removed: ");
        String hoo = scanner.nextLine();
        int check = branchNum(hoo);
        if(check == -1){
            System.out.println("Branch with such name does not exist! :(");
        }else{
            bankBranch.remove(check);
            System.out.println("Branch removed Successfully!! :)");
        }
    }
    public Branch selectBranch(){
        System.out.println("Select your branch: ");
        listBranches();
        int f = scanner.nextInt();
        return bankBranch.get(f-1);
    }
    public void listBranches(){
        System.out.println("Branches list:");
        for(int i = 0;i<bankBranch.size();i++){
            System.out.println(bankBranch.get(i).getBranchName());
        }
    }
    public int branchNum(String randName){
        for(int i = 0;i<bankBranch.size();i++){
            Branch test = bankBranch.get(i);
            if(test.getBranchCustomers().equals(randName)){
                return i;
            }
        }
        return -1;
    }

    public String getBankName() {
        return bankName;
    }
}
