package in.pravakar.service;

import in.pravakar.request.Passenger;
import in.pravakar.response.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}
