package com.njkol.designpatterrns.creational.abstractfactory;

public class ElfCastle implements Castle {
	private static final String DESCRIPTION = "This is the elven castle!";

	public String getDescription() {
		return DESCRIPTION;
	}
	
	@Override
	public String toString() {
		return "ElfCastle";
	}
}