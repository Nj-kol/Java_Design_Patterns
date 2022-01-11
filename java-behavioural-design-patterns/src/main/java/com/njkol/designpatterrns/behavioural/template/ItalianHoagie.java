package com.njkol.designpatterrns.behavioural.template;

/**
 * 
 * Concrete implementation of the sandwich making algorithm
 *
 */
public class ItalianHoagie extends Hoagie {

	private final String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
	private final String[] cheeseUsed = { "Provolone" };
	private final String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	private final String[] condimentsUsed = { "Oil", "Vinegar" };

	@Override
	public void addMeat() {
		System.out.print("Adding the Meat: ");
		for (String meat : meatUsed) {
			System.out.print(meat + " ");
		}
	}

	@Override
	public void addCheese() {
		System.out.print("Adding the Cheese: ");
		for (String cheese : cheeseUsed) {
			System.out.print(cheese + " ");
		}
	}

	@Override
	public void addVegetables() {
		System.out.print("Adding the Vegetables: ");
		for (String vegetable : veggiesUsed) {
			System.out.print(vegetable + " ");
		}
	}

	@Override
	public void addCondiments() {
		System.out.print("Adding the Condiments: ");
		for (String condiment : condimentsUsed) {
			System.out.print(condiment + " ");
		}
	}
}