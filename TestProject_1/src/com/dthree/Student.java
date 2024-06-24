package com.dthree;

public class Student extends Citizen {
	private int rollNo;
	private String clgName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNo, String clgName) {
		super();
		this.rollNo = rollNo;
		this.clgName = clgName;
	}

	public Student(String name, long adhaarNo, String address, long phno) {// to give value to base class members
		super(name, adhaarNo, address, phno);
		// TODO Auto-generated constructor stub
//		this.Student(74913,"mishd");
		this.rollNo = rollNo;
		this.clgName = clgName;
	}

	
	
	
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", clgName=" + clgName + ", name=" + name + ", adhaarNo=" + adhaarNo
				+ ", address=" + address + ", phno=" + phno + "]";
	}

	
	
	

	
	
	
	
	
}
