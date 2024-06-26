package com.mishkat.assignment.assg5;

public abstract class TaxPayers {
	abstract void calTax();
	
	protected double tax;
	
	void show() {
		System.out.println("The tax for the given salary is "+tax);	
	}
	
	
}
