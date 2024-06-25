package com.mishkat.assignment.assg4;

public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tickets t1 = new Tickets("Alice", "New York");
		Tickets t2 = new Tickets("Bob", "Los Angeles");
		Tickets t3 = new Tickets("Alex", "New York");
		System.out.println("\nAvailable tickets: " + Tickets.availableTickets);
		Tickets t4 = new Tickets("Bobby", "Boston");
		Tickets t5 = new Tickets("Pippa", "Los Angeles");
		Tickets t6 = new Tickets("Alice", "New York");

		System.out.println("\nAvailable tickets: " + Tickets.availableTickets);
		
		System.out.println(t5);
	}

}
