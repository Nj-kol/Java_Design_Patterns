package com.njkol.designpatterrns.structural.facade;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

//Sub system 2
public class HotelBooker {

	public List<Hotel> getHotelsFor(Date from, Date to) {
		// returns hotels available in the particular date range
		List<Hotel> available = Arrays.asList(new Hotel("Lyyods",3),new Hotel("Sana Resort",4));
		return available;
	}
}
