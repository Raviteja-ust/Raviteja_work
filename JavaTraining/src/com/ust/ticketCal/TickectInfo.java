package com.ust.ticketCal;

public class TickectInfo {
	
	private int ticketId;
	private String name;
	private String source;
	private String destination;
	private double km;
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	public TickectInfo() {
		super();
	}
	public TickectInfo(int ticketId, String name, String source, String destination, double km, double amount) {
		super();
		this.ticketId = ticketId;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.km = km;
		
	}
	@Override
	public String toString() {
		return "TickectInfo [ticketId=" + ticketId + ", name=" + name + ", source=" + source + ", destination="
				+ destination + ", km=" + km +  "]";
	}
	
	

}
