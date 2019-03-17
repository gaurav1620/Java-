package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
	    Account bob = new Account(78867,2000,"Gaurav","Google.google.com");

//	    bob.setAccountno(1234);
//	    bob.setBalance(2000);
// 	    bob.setName("Bob");
//	    bob.setEmail("okay@google.com");
		System.out.println("Name: "+bob.getName());
		System.out.println("Account number: "+bob.getAccountno());
	    bob.Withdraw(100);
	    bob.Deposit(2000);
	    bob.Withdraw(5000);

	    Account adam = new Account();

		System.out.println("Name: "+adam.getName());
		System.out.println("Account number: "+adam.getAccountno());
		adam.Withdraw(100);
		adam.Deposit(2000);
		adam.Withdraw(5000);

    }


}
