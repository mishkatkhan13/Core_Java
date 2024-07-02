package com.dfive;

public class Personone extends TaxPayers {
	String name;
	double salary;
	
	
	
	public Personone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personone(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	void calTax() {
		// TODO Auto-generated method stub
	
		if(salary <= 50000) {
			tax = salary * 0.1;
		} else if(salary <= 100000) {
			tax = salary * 0.2;
		} else {
			tax = salary * 0.4;
		}	
	}

}
