package com.njkol.designpatterrns.behavioural.mediator;

import org.junit.jupiter.api.Test;

public class TestMediator {

	@Test
	public void testMediator() {

		Runway runwayA = new Runway("Runway A");
		
		AircraftMediator mediator = new AicraftTrafficControlRoom();
		mediator.registerRunway(runwayA);
		
		Aircraft wrightFlight = new Aircraft(mediator, "Wright Flight"); 
		Aircraft airbusA380 = new Aircraft(mediator, "Airbus A380"); 
		
		wrightFlight.startLanding(); 
		airbusA380.startLanding();
		wrightFlight.finishLanding(); 	
	}
}
