package com.ust.ticketCal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketService {

	public void calculateTicketPrice(){
		
		List<TickectInfo> tickectInfo = new TicketDao().getTicketInfo();
		
		//tickectInfo.forEach(a-> System.out.println(a.getTicketId()+","+a.getName()+","+a.getSource()+","+a.getDestination()+","+a.getKm()+","+(a.getKm()*5)));
		
		Map<TickectInfo,Double> result=new HashMap<>();
		double price=5.0;
		
		for(TickectInfo tinfo:tickectInfo)
		{
			double km = tinfo.getKm();
			double amount=km*price;
			result.put(tinfo, amount);
		}
		
		
		 result.entrySet().forEach(a->{
			 System.out.println(a.getKey()+", price="+a.getValue());
		});
	}
	
	public static void main(String[] args) {
		TicketService ts=new TicketService();
		ts.calculateTicketPrice();

	}

}
