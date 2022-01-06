package com.njkol.designpatterrns.creational.abstractfactory;

public class OrcKing implements King {
	private static final String DESCRIPTION = "This is the Orc king!";

	public String getDescription() {
		return DESCRIPTION;
	}

	@Override
	public String toString() {
		return "OrcKing";
	}
}