package com.mishkat.assignment.assg2;

import java.util.Scanner;

public class Commission {
	
	Scanner sc = new Scanner(System.in);
	
	private String name, address;
	private int phone;
	private double sales_amount;
	double comm;
		
	public void getdetails() {
		System.out.println("Enter ur name: ");
		this.name = sc.nextLine();
		System.out.println("Enter ur address: ");
		this.address = sc.nextLine();
		System.out.println("Enter ur phone no.: ");
		this.phone = sc.nextInt();
		System.out.println("Enter ur sales amount: ");
		this.sales_amount = sc.nextDouble();
		
	}
	
	public void calc() {
		if (sales_amount >= 100000) {
			comm = sales_amount * 10/100;
		} else if (sales_amount >= 50000) {
			comm = sales_amount * 5/100;
		} else if (sales_amount >= 30000) {
			comm = sales_amount * 3/100;
		} else {
			System.out.println("No Commission");
		}

	}
	
	public void display() {
		System.out.println("\nEmployee Name: "+name);
		System.out.println("Employee Address: "+address);
		System.out.println("Employee Phone No.: "+phone);
		System.out.println("Employee Sales Amount: "+sales_amount);
		System.out.println("Employee Commission: "+comm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commission c = new Commission();
		c.getdetails();
		c.calc();
		c.display();
		
	}

}
