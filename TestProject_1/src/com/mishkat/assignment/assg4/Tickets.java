package com.mishkat.assignment.assg4;

public class Tickets {
	static int availableTickets = 5;
	
	String psngrName;
    int tcktNum;
    String dest;
    
    static {
    	System.out.println("Available tickets: " + Tickets.availableTickets);
    }
    
	public Tickets(String psngrName, String dest) {
		super();
		if (availableTickets > 0) {
            this.psngrName = psngrName;
            this.dest = dest;
            this.tcktNum = 6 - availableTickets; 
            availableTickets--; 
            System.out.println("Ticket booked successfully for " + psngrName);
        } else {
            System.out.println("No tickets available!");
        }
	}
	
	@Override
	public String toString() {
		return "Ticket Details: [Ticket Number: " + tcktNum + ", Passenger Name: " + psngrName + ",  Destination: " + dest + "]";
	}
 
    
}
