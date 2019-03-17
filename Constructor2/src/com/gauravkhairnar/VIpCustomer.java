package com.gauravkhairnar;

public class VIpCustomer {
    private String Name;
    private int  CreditLimit;
    private String Email;

    public VIpCustomer(String name, int creditLimit, String email) {
        this.Name = name;
        this.CreditLimit = creditLimit;
        this.Email = email;
    }

    public VIpCustomer(String name, int creditLimit) {
        this.Name = name;
        this.CreditLimit = creditLimit;
        this.Email = "Default@google.com";
    }

    public VIpCustomer() {
        this.Name = "Default_Name";
        this.CreditLimit = 000;
        this.Email = "Default@google.com";
    }

    public String getName() {
        System.out.println(this.Name);
        return Name;
    }

    public int getCreditLimit() {
        System.out.println(this.CreditLimit);
        return CreditLimit;
    }

    public String getEmail() {
        System.out.println(this.Email);
        return Email;
    }
}
