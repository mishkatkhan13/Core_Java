package com.polymorphism;

public class MOverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload ob = new MethodOverload();
		
		System.out.println("Addition of two integers: "+MethodOverload.addition(10, 10));
		System.out.println("Addition of two float: "+MethodOverload.addition(10.0f, 11.2f));
		System.out.println("Addition of float and Int: "+MethodOverload.addition(100, 11.2f));
		System.out.println("Addition of two Strings: "+MethodOverload.addition("Hello", "World"));
	}

}
