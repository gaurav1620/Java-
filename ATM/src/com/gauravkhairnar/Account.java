package com.gauravkhairnar;

public class Account {
    private String name;
    private int pin,accountNumber,balance;

//    public Account(String name, int pin, int accountNumber) {
//        this.name = name;
//        this.pin = pin;
//        this.accountNumber = accountNumber;
//    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
