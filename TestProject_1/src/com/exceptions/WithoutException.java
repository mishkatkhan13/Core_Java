package com.exceptions;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int d =0;
			int a =42/d;
			System.out.println("Will not be printed");}
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		catch (NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
		catch (Exception e) {
			System.out.println(e);
			return;
		}
		
		finally {
			System.out.println("execute enyayws");
		}

	}

}
