package com.njkol.designpatterrns.creational.abstractfactory;

import org.junit.jupiter.api.Test;


public class TestAbstractFactory {

	@Test
	public void testFactoryForELF() {
		KingdomFactory kf = FactoryMaker.makeFactory(KingdomType.ELF);
		Player p1 = new Player(kf.createCastle(),kf.createKing(),kf.createArmy());
		System.out.println(p1);
	}
	
	@Test
	public void testFactoryForORC() {
		KingdomFactory kf = FactoryMaker.makeFactory(KingdomType.ORC);
		Player p2 = new Player(kf.createCastle(),kf.createKing(),kf.createArmy());
		System.out.println(p2);
	}
	
}
