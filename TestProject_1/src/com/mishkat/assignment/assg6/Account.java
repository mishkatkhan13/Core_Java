package com.mishkat.assignment.assg6;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account {
	
	String name;
	long balance;
		
	Scanner sc = new Scanner(System.in);
	long amt;
	
	abstract void deposit(long amt);
	abstract void withdraw(long amt);
	abstract void getBalance();
	
	public Account(String name, long balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	

	long getAmount() {
		System.out.println("Enter the amount: ");
		amt = sc.nextLong();
		return amt;
	}
		
	}
	
	
	
	
}
