package com.mishkat.assignment.assg6;

import java.util.Scanner;

public class Transaction {
	
	final int transactionFee = 50;
	long amt;
	
	Scanner sc = new Scanner(System.in);
	Bank a = new Bank();
	
	public void executeTransaction() {
		while(true) {
			System.out.println("-----WELCOME TO THE BANK-----");
			System.out.println("Select an option: ");
            System.out.println("1. Create new account");
            System.out.println("2. Perform transaction");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            
            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    a.createAccount();
                    break;
                case 2:
                    performTransaction();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
		}
	}
	
	final void performTransaction() {
		System.out.println("Enter account number (starting from 1): ");
		int actNum = sc.nextInt() - 1;

		Account getacct = a.getAccount(actNum);
		if (getacct == null) {
		    System.out.println("Account not found. Please try again.");
		    return;
		}
		System.out.println("Account found with name "+getacct.name);
		
		System.out.println("Enter transaction type (1 for Deposit, 2 for Withdrawal, 3 for Balance): ");
		int ch = sc.nextInt();
				
		switch(ch) {
    		case 1: 
    			amt = getacct.getAmount();	
    			getacct.deposit(amt);
    			getacct.withdraw(transactionFee);
    	        System.out.println("Transaction Successful, Transaction Fee Deducted: "+transactionFee);
    			getacct.getBalance();
    			break;
    		case 2:
    			amt = getacct.getAmount();
    			getacct.withdraw(amt+transactionFee);
    			System.out.println("Transaction Successful, Transaction Fee Deducted: "+transactionFee);
    			getacct.getBalance();
    			break;
    		case 3:
    			getacct.getBalance();
    			break;
    		default:
    			System.out.println("Incorrect Choice");
    		}
    		
	}
        	

}






