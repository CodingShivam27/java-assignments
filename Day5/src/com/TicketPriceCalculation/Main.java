package com.TicketPriceCalculation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBean bean=new TicketBean();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the TicketId");
		int id=input.nextInt();
		bean.setTicketid(id);
		
		System.out.println("Available Tickets");
		int available=input.nextInt();
		bean.setAvailableTickets(available);
		
		System.out.println("Enter the Price");
		int price=input.nextInt();
		bean.setPrice(price);
		
		System.out.println("Enter the no of Tickets");
		int nooftickets=input.nextInt();
		
		
		
		int total= bean.calculateTicketCost(nooftickets);
		
		System.out.println("Total amount:"+total);
		
		System.out.println("Available ticket after booking:"+bean.getAvailableTickets());
		
		
		
		
	}

}
