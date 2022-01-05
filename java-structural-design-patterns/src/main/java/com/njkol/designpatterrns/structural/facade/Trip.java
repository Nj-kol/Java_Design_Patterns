package com.njkol.designpatterrns.structural.facade;

import java.util.List;

public class Trip {

	List<Flight> flights;
	List<Hotel> hotels;
	
	public Trip(List<Flight> flights, List<Hotel> hotels) {
		super();
		this.flights = flights;
		this.hotels = hotels;
	}

	@Override
	public String toString() {
		return "Trip [flights=" + flights + ", hotels=" + hotels + "]";
	}      
	
}
