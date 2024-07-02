package com.dfive;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TaxPayers ob;
		Scanner sc = new Scanner(System.in);
		Personone ob = new Personone(); 
		
		System.out.println("Enter ur name: ");
		ob.name = sc.nextLine();
		System.out.println("Enter ur address: ");
		ob.salary = sc.nextDouble();
				
		ob.calTax();
		System.out.println("\nName: "+ ob.name + ", Salary: "+ob.salary);
		ob.show();
	}

}
