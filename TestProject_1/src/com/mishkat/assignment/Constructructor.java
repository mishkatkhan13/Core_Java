package com.mishkat.assignment;

public class Constructructor {
	
	private String custName;
	private int custId;
	private String custCity;
	
	public Constructructor() {
		System.out.println("Defualt");
		
	}
	
	public Constructructor(int custId, String custNamee, String city) {
		this.custId = custId;
		this.custName = custNamee;
		this.custCity = city;
	}
	
//	public String getCustName() {
//		return custName;
//	}


	

//	public void setCustName(String custName) {
//		this.custName = custName;
//	}
//
//
//
//	public int getCustId() {
//		return custId;
//	}
//
//
//
//	public void setCustId(int custId) {
//		this.custId = custId;
//	}
//
//
//
//	public String getCustCity() {
//		return custCity;
//	}
//
//
//
//	public void setCustCity(String custCity) {
//		this.custCity = custCity;
//	}



	@Override
	public String toString() {
		return "Constructructor [custName=" + custName + ", custId=" + custId + ", custCity=" + custCity + "]";
	}
	
	

}
