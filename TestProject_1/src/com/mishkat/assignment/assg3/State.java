package com.mishkat.assignment.assg3;

public class State extends Country{
	protected String governor;
	protected String largCity;
	
	public State(String name, double area, String capital, double population, String governor, String largCity) {
		super(name, area, capital, population);
		this.governor = governor;
		this.largCity = largCity;
	}

	@Override
	public String toString() {
		return super.toString() + "State [governor= " + governor + ", largCity= " + largCity + "]";
	}

	

	
}
