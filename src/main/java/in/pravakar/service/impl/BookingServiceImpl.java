package in.pravakar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.pravakar.request.Passenger;
import in.pravakar.response.Ticket;
import in.pravakar.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	
	private Map<Integer, Ticket> ticketMap = new HashMap<>();
	private Integer ticketNum = 1;
	

	@Override
	public Ticket bookTicket(Passenger passenger) {
		//logic
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(550.0);
		t.setStatus("CONFORMED");
		t.setTicketNum(ticketNum);
		ticketMap.put(ticketNum, t);
		ticketNum++;
		
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
		return null;
	}

}
