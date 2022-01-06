package com.njkol.designpatterrns.creational.abstractfactory;

public class OrcArmy implements Army {
	private static final String DESCRIPTION = "This is the orc Army!";

	public String getDescription() {
		return DESCRIPTION;
	}
	
	@Override
	public String toString() {
		return "OrcArmy";
	}
}