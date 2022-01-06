package com.njkol.designpatterrns.creational.abstractfactory;

public class OrcCastle implements Castle {
	private static final String DESCRIPTION = "This is the ORC castle!";

	public String getDescription() {
		return DESCRIPTION;
	}
	
	@Override
	public String toString() {
		return "OrcCastle";
	}
}
