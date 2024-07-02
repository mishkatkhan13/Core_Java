package com.mishkat.assignment.assg8;

public class NestedTry {

	public static void main(String[] args) {
		try {
            try {
                int num[] = {1, 2, 3};
                System.out.println("Value at index 3: " + num[3]);
             
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught " +e.getMessage() + ", inside inner try block");
            }
            
            int a = 10 / 0;
            
        } catch (ArithmeticException e) {
        	
            System.out.println("Caught " +e.getMessage() + ", outside inner try block");
        }

	}

}
