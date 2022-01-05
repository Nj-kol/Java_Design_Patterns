package com.njkol.designpatterrns.structural.facade;

public class Hotel {

	private String hotelName;
	private int starRating;
	
	public Hotel(String hotelName, int starRating) {
		super();
		this.hotelName = hotelName;
		this.starRating = starRating;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", starRating=" + starRating + "]";
	}
	
}
