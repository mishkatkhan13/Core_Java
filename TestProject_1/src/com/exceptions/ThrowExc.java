package com.exceptions;

public class ThrowExc {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid Age");		
		} else {
			System.out.println("You can vote");
		}
	}
}	
