package com.njkol.designpatterrns.structural.facade;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class TestFacade {

	@Test
	public void testFacade() {
		TravelFacade tf = new TravelFacade();
		System.out.println(tf.makeTrip(new Date(), new Date()));
	}

}
