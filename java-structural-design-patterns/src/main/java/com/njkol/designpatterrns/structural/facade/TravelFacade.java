package com.njkol.designpatterrns.structural.facade;

import java.util.ArrayList;
import java.util.Date;


/**
 * The Facade class encompassing the subsystems
 * 
 * @author Nilanjan Sarkar
 *
 */
public class TravelFacade {

	private HotelBooker hotelBooker;   
	private FlightBooker flightBooker;  
	
	public void makeTrip(Date from, Date to)  {        
		ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);        
		ArrayList<Hotel> hotels = hotelBooker.getHotelsFor(from, to);        
		//process and return   
	}
}
