package com.staticc;

public class Myclass {
	private int section;
	private static int srNo;
	static {
		System.out.println("---Static Block");
		
		srNo=1000;
	}
	Myclass(){
		System.out.println("Default");
		srNo++;
		section++;
	}
	
	static void display() {
		System.out.println("--static  methodd--");
		System.out.println("--setial no is" +srNo);
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "Srial No= "+srNo + "]" ;
	}
	
	
}
