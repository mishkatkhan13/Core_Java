package com.interfaces;

public class Demo {
	
	void m1(char c) {
		System.out.println("nsdfui");
	}
	
	void m1(int a) {
		System.out.println("nsdfui");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon ob = new PrimeAccount(); //
		Amazon.aboutUs();
		ob.welcome();
		ob.thankyou();
		
		Amazon obj = new NonPrimeAccount();
		obj.welcome();
		obj.serviceCharge();
		obj.thankyou();
		
		Demo obj1 = new Demo(); //
		
		obj1.m1(101);
	
		

	}

}
