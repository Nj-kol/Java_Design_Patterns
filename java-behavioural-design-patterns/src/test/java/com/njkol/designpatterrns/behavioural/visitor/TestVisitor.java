package com.njkol.designpatterrns.behavioural.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVisitor {

	private Necessity milk;
	private Liquor vodka;
	private Tobacco cigars;

	@BeforeEach
	public void setUp() {
		milk = new Necessity(3.47);
		vodka = new Liquor(11.99);
		cigars = new Tobacco(19.99);
	}

	@Test
	public void testTaxVisitor() {
		TaxVisitor taxCalc = new TaxVisitor();
		System.out.println("REGULAR TAX HOLIDAY PRICES\n");
		System.out.println(milk.accept(taxCalc) + "\n");
		System.out.println(vodka.accept(taxCalc) + "\n");
		System.out.println(cigars.accept(taxCalc) + "\n");
	}

	@Test
	public void testTaxHolidayVisitor() {
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		System.out.println("TAX HOLIDAY PRICES\n");
		System.out.println(milk.accept(taxHolidayCalc) + "\n");
		System.out.println(vodka.accept(taxHolidayCalc) + "\n");
		System.out.println(cigars.accept(taxHolidayCalc) + "\n");
	}
}
