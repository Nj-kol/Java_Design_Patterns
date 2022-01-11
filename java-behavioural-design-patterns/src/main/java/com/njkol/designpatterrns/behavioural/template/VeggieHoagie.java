package com.njkol.designpatterrns.behavioural.template;

/**
 * 
 * Concrete implementation of the sandwich making algorithm
 *
 */
public class VeggieHoagie extends Hoagie {

	private String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	private String[] condimentsUsed = { "Oil", "Vinegar" };

	// Override the hooks as well in this case
	public boolean customerWantsMeat() {
		return false;
	}

	public boolean customerWantsCheese() {
		return false;
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

	@Override
	public void addMeat() {
	}

	@Override
	public void addCheese() {
	}
}