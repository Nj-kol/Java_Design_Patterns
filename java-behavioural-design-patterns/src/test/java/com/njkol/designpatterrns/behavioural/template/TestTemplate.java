package com.njkol.designpatterrns.behavioural.template;

import org.junit.jupiter.api.Test;

public class TestTemplate {

	private Hoagie sandwich;
	
	@Test
	public void testItalianSandwich() {
		sandwich = new ItalianHoagie();
		sandwich.makeSandwich();

	}
	
	@Test
	public void testVegetableHoagie() {
		sandwich = new VeggieHoagie();
		sandwich.makeSandwich();
	}
}
