package com.mishkat.assignment.assg6;

public class SavingsAccount extends Account{
		
	public SavingsAccount(String name, long balance) {
		super(name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(long amt) {
		// TODO Auto-generated method stub
		 if (amt > 0) {
	            balance += amt;
//	            System.out.println();
	     } else System.out.println("Kindly enter proper amount");
	}

	@Override
	void withdraw(long amt) {
		// TODO Auto-generated method stub
		if (amt > 0 && balance >= amt) {
            balance -= amt;
        } else System.out.println("Insufficient Balance");
		
	}

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Your Saving Account Balance: "+balance);		
	}

}
