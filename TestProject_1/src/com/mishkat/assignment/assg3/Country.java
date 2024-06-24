package com.mishkat.assignment.assg3;

public class Country extends Continent {
	protected String capital;
	protected double population;
	
	public Country(String name, double area, String capital, Double population) {
		super(name, area);
		this.capital = capital;
		this.population = population;
	}

	@Override
	public String toString() {
		return super.toString() + "Country [capital= " + capital + ", population= " + population + "] ";
	}

	
	
	
}
