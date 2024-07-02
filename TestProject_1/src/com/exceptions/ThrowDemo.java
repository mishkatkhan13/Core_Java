package com.exceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowExc.validate(10);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
