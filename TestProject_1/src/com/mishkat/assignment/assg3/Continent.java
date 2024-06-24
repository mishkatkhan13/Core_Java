package com.mishkat.assignment.assg3;

public class Continent {
	protected String name;
	protected double area;
	
	public Continent(String name, double area) {
		super();
		this.name = name;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Continent [Name= " + name + ", area= " + area + "] ";
	}
		
	
}
