package com.mishkat.assignment.assg6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	
	static int bankAccount = 0;
	
	static ArrayList<Account> accounts = new ArrayList<>();
	
	static void getTotalAccounts() {
		System.out.println("Total No. of bank account is "+bankAccount);
	}
	
	public void createAccount() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
        String name = sc.nextLine();
		
        System.out.println("Enter your account type (1 for Savings, 2 for Checking): ");
        int type = sc.nextInt();
		
		System.out.println("Enter initial balance: ");
        long initialBalance = sc.nextLong();

        Account account = null;
        if (type == 1) {
            account = new SavingsAccount(name, "Saving", initialBalance);
        } else if (type == 2) {
            account = new CheckingAccount(name, "Checking", initialBalance);
        }
        if (account != null) {
            accounts.add(account);
            Bank.bankAccount++;
            System.out.println("Account created successfully. Your account ID is "+Bank.bankAccount);
            //System.out.println(accounts.get(0).toString());   
        }
       
    }
	
	public static Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }
 
	
}
