package com.interfaces;

public interface Amazon {
	void welcome();
	void thankyou();
	
	default void serviceCharge() {
		int amt=100;
		System.out.println("The Service charge is "+amt);
	}
	
	static void aboutUs() {
		System.out.println("Its a ecommerce website");
	}

}
