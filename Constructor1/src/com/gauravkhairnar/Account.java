package com.gauravkhairnar;

public class Account {
    private int accountno;
    private int balance;
    private String name;
    private String email;


    //THIs is an  constructor
    public Account(){
        this(000,000,"Default Name","Default@gmial.com");
        System.out.println("\nEmpty Constructor called!!");
    }

    //this typa constructor is used to directly assign values to the class without using set.parameter
    public Account(int accountno,int balance,String  name,String email){
        System.out.println("\nConstructor with Parameters Called !!");
        this.accountno = accountno;  // OR set.accountno(accountno);
        this.balance =  balance;
        this.name = name;
        this.email = email;
    }

    public void Withdraw(int Withdraw){
        if(balance >= Withdraw){
            this.balance -=  Withdraw;
            System.out.println("Withdraw of " + Withdraw + " is successful and the current balance is " +this.balance );
        }
        else{

            System.out.println("Withdraw of " + Withdraw + " is unsuccessful as  the current balance is " +this.balance );
        }

    }
    public void Deposit(int Deposit){
        this.balance += Deposit;
        System.out.println("Deposit of "+Deposit+ " is successful and the current balance is "+this.balance);
    }
    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
