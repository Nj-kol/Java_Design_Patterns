package com.njkol.designpatterrns.creational.factory;

import org.junit.jupiter.api.Test;

public class TestFactoryPattern {

	// Create the factory object
	private EnemyShipFactory shipFactory = new EnemyShipFactory();

	@Test
	public void testFactoryForUFO() {
		EnemyShip theEnemy = shipFactory.makeEnemyShip(ShipType.UFO);
		doStuffEnemy(theEnemy);
	}
	
	@Test
	public void testFactoryForBigUFO() {
		EnemyShip theEnemy = shipFactory.makeEnemyShip(ShipType.BigUFO);
		doStuffEnemy(theEnemy);
	}
	
	@Test
	public void testFactoryForRocket() {
		EnemyShip theEnemy = shipFactory.makeEnemyShip(ShipType.Rocket);
		doStuffEnemy(theEnemy);
	}
	
	// Executes methods of the super class
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
