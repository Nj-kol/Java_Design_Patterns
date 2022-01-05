package com.njkol.designpatterrns.structural.facade;

public class Flight {

	private String carrierName;
	private String flightNumber;
	
	public Flight(String carrierName, String flightNumber) {
		super();
		this.carrierName = carrierName;
		this.flightNumber = flightNumber;
	}

	@Override
	public String toString() {
		return "Flight [carrierName=" + carrierName + ", flightNumber=" + flightNumber + "]";
	}
}
