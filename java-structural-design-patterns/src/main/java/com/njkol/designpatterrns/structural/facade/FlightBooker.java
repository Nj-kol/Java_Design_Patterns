package com.njkol.designpatterrns.structural.facade;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

//Sub system 1
public class FlightBooker {

	public List<Flight> getFlightsFor(Date from, Date to) {
		// returns flights available in the particular date range
		List<Flight> available = Arrays.asList(new Flight("Emirates", "EX1224"), new Flight("Qatar", "QA1224"));
		return available;
	}
}
