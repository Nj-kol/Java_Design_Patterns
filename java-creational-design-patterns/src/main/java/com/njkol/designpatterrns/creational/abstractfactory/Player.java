package com.njkol.designpatterrns.creational.abstractfactory;

public final class Player {

	private final Castle castle;
	private final King king;
	private final Army army;
	
	public Player(Castle castle, King king, Army army) {
		super();
		this.castle = castle;
		this.king = king;
		this.army = army;
	}

	@Override
	public String toString() {
		return "Player [castle=" + castle + ", king=" + king + ", army=" + army + "]";
	}
	
}
