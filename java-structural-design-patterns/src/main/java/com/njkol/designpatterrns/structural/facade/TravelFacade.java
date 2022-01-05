package com.njkol.designpatterrns.structural.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * The Facade class encompassing the subsystems
 * 
 * @author Nilanjan Sarkar
 *
 */
public class TravelFacade {

	// Sub systems
	private HotelBooker hotelBooker = new  HotelBooker();   
	private FlightBooker flightBooker= new FlightBooker();  
	
	public Trip makeTrip(Date from, Date to)  {        
		List<Flight> flights = flightBooker.getFlightsFor(from, to);        
		List<Hotel> hotels = hotelBooker.getHotelsFor(from, to);        
		return new Trip(flights,hotels);
	}
}
