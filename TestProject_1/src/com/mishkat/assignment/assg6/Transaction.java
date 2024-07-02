package com.mishkat.assignment.assg6;

import java.util.Scanner;

public class Transaction {
	
	final int transactionFee = 100;
	long amt;
	Scanner sc = new Scanner(System.in);
	Bank a = new Bank();
	
	public void executeTransaction() {
		while(true) {
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
        
        System.out.println(getacct);
	}
//        System.out.println("Enter transaction type (1 for Deposit, 2 for Withdrawal 3 for Checking Balance): ");
//		int ch = sc.nextInt();
//		
//        while (true) {
//    		switch(ch) {
//    			case 1: 
//    				amt = a.getAmount();	
//    				a.deposit(amt);
//    				a.withdraw(transactionFee);
//    				break;
//    			case 2:
//    				amt = a.getAmount();	
//    				a.withdraw(amt+transactionFee);
//    				break;
//    			case 3:
//    				a.getBalance();
//    				break;
//    			default:
//    				System.out.println("Incorrect Choice");
//    		}
//    	 } 
//        
//	}
//	
	

}



//System.out.println("Select account to perform transaction(1 for Savings, 2 for Checking, 0 to Exit): ");
//int choice = sc.nextInt();
//if(choice == 0) {
//	System.out.println("Exiting...");
//	break;
//} else if (choice < 1 || choice > 2) {
//	System.out.println("Invalid choice. Please try again.");
//	continue;
//} else {
//if (ch != 1 || ch != 2 || ch!=3) {
//System.out.println("Invalid transaction type. Please try again.");
//continue;
//}



// }