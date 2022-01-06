package com.njkol.designpatterrns.creational.abstractfactory;

public class ElfArmy implements Army {
	private static final String DESCRIPTION = "This is the elven Army!";

	public String getDescription() {
		return DESCRIPTION;
	}

	@Override
	public String toString() {
		return "ElfArmy";
	}
}