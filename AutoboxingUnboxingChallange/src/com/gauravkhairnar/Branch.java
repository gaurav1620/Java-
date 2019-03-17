package com.gauravkhairnar;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private Scanner scanner = new Scanner(System.in);
    private String branchName;
    ArrayList<Customer> branchCustomers = new ArrayList<Customer>();


    public void addCustomer(){
        System.out.println("Enter the name of customer: ");
        String name = scanner.nextLine();
        int check = custNumber(name);
        if(check == -1){
            Customer newCustomer = new Customer();
            newCustomer.setName(name);
            branchCustomers.add(newCustomer);
            System.out.println("The customer is added! ");
        }else{
            System.out.println("Customer already registered");
        }

    }
    public void addTransactions(){
        System.out.println("Enter the name of customer: ");
        String name = scanner.nextLine();
        int check = custNumber(name);
        if(check == -1){
            System.out.println("Enter the amount: ");
            double trans = scanner.nextDouble();
            branchCustomers.get(check).getTransactions().add(trans);
            System.out.println("Transaction added!");
        }else{
            System.out.println("Customer not registered! :(");
        }
    }
    public void printCustomerList(){
        for(int i = 0;i<branchCustomers.size();i++){
            System.out.println((i+1)+". --> "+branchCustomers.get(i).getName());
        }
    }
    public void removeCustomerAccount(){
        System.out.println("Enter the name of customer to be removed: ");
        String name = scanner.nextLine();
        int num = custNumber(name);
        if(num == -1){
            branchCustomers.remove(num);
            System.out.println("Customer removed Successfully! :)");
        }else{
            System.out.println("Customer is not registered! :(");
        }
    }

    public int custNumber(String randName){
        for(int i = 0;i<branchCustomers.size();i++){
            Customer test = branchCustomers.get(i);
            if(test.getName().equals(randName)){
                return i;
            }
        }
        return -1;
    }





    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public void setBranchCustomers(ArrayList<Customer> branchCustomers) {
        this.branchCustomers = branchCustomers;
    }

//    public Branch(String branchName, ArrayList<Customer> branchCustomers) {
//        this.branchName = branchName;
//        this.branchCustomers = branchCustomers;
//    }
}
