package com.ust.ticketCal;

import java.util.ArrayList;
import java.util.List;

public class TicketDao {
	
	public List<TickectInfo> getTicketInfo()
	{
		List<TickectInfo> tinfo=new ArrayList<TickectInfo>();
		tinfo.add(new TickectInfo(1, "Ravi", "vizag", "Hyd", 800, 0));
		tinfo.add(new TickectInfo(1, "Teja", "vizag", "BBL", 100, 0));
		return tinfo;
	}

}
