package com.TicketPriceCalculation;

public class TicketBean {

	private int ticketid;
	private int price;
	
	private static int availableTickets;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	//
	
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>=0) {
			TicketBean.availableTickets = availableTickets;
		}
	}

	public TicketBean() {
		// TODO Auto-generated constructor stub
	}
	
	public int calculateTicketCost(int nooftickets) {
		if (TicketBean.availableTickets>=nooftickets) {
			TicketBean.availableTickets=TicketBean.availableTickets-nooftickets;
			int price=this.price*nooftickets;
			return price;
		}
		else {
			return -1;
		}
	}

}
