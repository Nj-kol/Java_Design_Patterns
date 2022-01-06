package com.njkol.designpatterrns.creational.abstractfactory;

public interface KingdomFactory {
	Castle createCastle();
	King createKing();
	Army createArmy();
}