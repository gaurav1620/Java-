package com.gauravkhairnar;

public class bank {
    private int accno,balance;
    private String name,email;
    private long phone;

    public void deposit(int deposit){
        this.balance += deposit;
        System.out.println("Your have deposited " + deposit + " and your current balance is "+ this.balance+"\n");
    }

    public void withdraw(int withdraw){
        if(this.balance >= withdraw){
            this.balance -= withdraw;
            System.out.println("You  have withdrawed " + withdraw + " and your current balance is "+this.balance +"\n");
        }
        else{
            System.out.println("Insufficient Balance ! Your current balance is " +this.balance +" \n");
        }

    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}

