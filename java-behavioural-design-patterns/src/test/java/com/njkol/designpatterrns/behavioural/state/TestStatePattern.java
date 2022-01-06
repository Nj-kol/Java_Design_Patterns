package com.njkol.designpatterrns.behavioural.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStatePattern {

	private ATMMachine atmMachine;
	
	@BeforeEach
	public void setup() {
		atmMachine = new ATMMachine();
	}
	
	@Test
	public void testNoTransaction() {
		atmMachine.insertCard();
		atmMachine.ejectCard();
	}
	
	@Test
	public void testCorrectWithDrawl() {
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.requestCash(2000);
	}
	
	@Test
	public void testIncorrect() {
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
	}
}