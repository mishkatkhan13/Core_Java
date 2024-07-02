package com.finalabstract;

public abstract class TaxPayers {
	abstract void calTax();
	
	protected double tax;
	
	public TaxPayers(double tax) {
		super();
		this.tax = tax;
	}

	void show() {
		System.out.println("The tax for the given salary is "+tax);	
	}
	
	
}
