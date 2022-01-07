package com.njkol.designpatterrns.creational.builder;

import org.junit.jupiter.api.Test;

public class TestBuilder {

	@Test
	public void testNutritionalFactsBuilder() {
		NutritionalFacts nf =  new NutritionalFacts.Builder(12,123).build();
		System.out.println(nf.toString());
	}
}
