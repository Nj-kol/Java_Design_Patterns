package com.njkol.designpatterrns.creational.factory;

//This is a factory thats only job is creating ships
//By encapsulating ship creation, we only have one
//place to make modifications

public class EnemyShipFactory {

	// This could be used as a static method if we
	// are willing to give up subclassing it
	public EnemyShip makeEnemyShip(ShipType newShipType) {

		switch (newShipType) {
		case UFO:
			return new UFOEnemyShip();
		case BigUFO:
			return new BigUFOEnemyShip();
		case Rocket:
			return new RocketEnemyShip();
		default:
			throw new UnsupportedOperationException("The ShipType provided is not supported");
		}
	}
}