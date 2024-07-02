package com.mishkat.assignment.assg6;

public class CheckingAccount extends Account {
	
	
	public CheckingAccount(String name, String type, long balance) {
		super(name, type, balance);
	}

	@Override
	void deposit(long amt) {
		 if (amt > 0) {
	            balance += amt;
	     } else System.out.println("Kindly enter proper amount");
	}

	@Override
	void withdraw(long amt) {
		if (amt > 0 && balance >= amt) {
            balance -= amt;
        } else System.out.println("Insufficient Balance");
		
	}

	@Override
	void getBalance() {
		System.out.println("Your Checking Account Balance: "+balance+"\n");		
	}


}
