package com.mishkat.assignment.assg6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	static int bankAccount = 0;
	static ArrayList<Account> accounts = new ArrayList<>();
	
	static void getTotalAccounts() {
		System.out.println("Total No. of bank account is "+bankAccount);
	}
	
	public static Account createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
        String name = sc.nextLine();
		
		System.out.println("Enter initial balance: ");
        long initialBalance = sc.nextLong();

        System.out.println("Select account type (1 for Savings, 2 for Checking): ");
        int accountType = sc.nextInt();

        Account account = null;
        if (accountType == 1) {
            account = new SavingsAccount(name, initialBalance);
        } else if (accountType == 2) {
            account = new CheckingAccount(name, initialBalance);
        }
        if (account != null) {
            accounts.add(account);
            Bank.bankAccount++;
            System.out.println("Account created successfully.");
            System.out.println(account);
            
        }
        return account;
    }
	
	public static Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }
	

	  
	
	
}
