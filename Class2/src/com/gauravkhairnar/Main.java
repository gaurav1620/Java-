package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
	bank customer = new bank();

	customer.setAccno(1962);
	customer.setBalance(5000);
	customer.setEmail("goorav@gmial.com");
	customer.setName("Gaurav");
	customer.setPhone(77440797);

	customer.withdraw(1000);
	customer.deposit(500);

	customer.withdraw(3000);
	customer.deposit(200);

	customer.withdraw(3000);
	customer.deposit(200);

    }
}
