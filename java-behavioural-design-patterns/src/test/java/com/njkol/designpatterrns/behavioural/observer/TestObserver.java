package com.njkol.designpatterrns.behavioural.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestObserver {

	@BeforeEach
	public void setUp() {

	}

	@Test
	public void testObserver() {
		
		Customer arpitPerson = new Customer(1,"Arpit");
		Customer johnPerson = new Customer(2,"John");

		Product samsungMobile = new Product("iPhone 13", "Mobile", "Not available");

		// When you opt for option "Notify me when product is available".Below
		// registerObserver method
		// get executed
		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);

		// Now product is available
		samsungMobile.setAvailability("Available");
	}
}
