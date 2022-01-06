package com.njkol.designpatterrns.creational.abstractfactory;

public class ElfKing implements King {
	private static final String DESCRIPTION = "This is the elven king!";

	public String getDescription() {
		return DESCRIPTION;
	}

	@Override
	public String toString() {
		return "ElfKing";
	}

}