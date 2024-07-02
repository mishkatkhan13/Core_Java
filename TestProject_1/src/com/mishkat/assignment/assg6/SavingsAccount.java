package com.mishkat.assignment.assg6;

public class SavingsAccount extends Account{
		
	public SavingsAccount(String name, String type, long balance) {
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
		System.out.println("Your Saving Account Balance: "+balance+"\n");		
	}

}
