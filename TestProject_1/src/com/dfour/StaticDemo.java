package com.dfour;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Employee.companyName;
		Employee ob = new Employee("neha",101);
		System.out.println("Company Name: "+Employee.companyName);
		System.out.println(ob);
				
		Employee ob1 = new Employee("abc",102);
		System.out.println(ob1);
	}

}
