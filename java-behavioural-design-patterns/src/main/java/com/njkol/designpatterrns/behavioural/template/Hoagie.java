package com.njkol.designpatterrns.behavioural.template;

//A Template Method Pattern contains a method that provides
//the steps of the algorithm. It allows subclasses to override 
//some of the methods

public abstract class Hoagie {

	boolean afterFirstCondiment = false;

	// These methods must be overridden by the extending subclasses
	public abstract void addMeat();

	public abstract void addCheese();

	public abstract void addVegetables();

	public abstract void addCondiments();

	// Default implementation
	public void cutBun() {
		System.out.println("The Hoagie is Cut");
	}

	// These are called hooks
	// If the user wants to override these they can

	// Use abstract methods when you want to force the user
	// to override and use a hook when you want it to be optional
	public boolean customerWantsMeat() {
		return true;
	}

	public boolean customerWantsCheese() {
		return true;
	}

	public boolean customerWantsVegetables() {
		return true;
	}

	public boolean customerWantsCondiments() {
		return true;
	}

	public void wrapTheHoagie() {
		System.out.println("\nWrap the Hoagie");
	}

	public void afterFirstCondiment() {
		System.out.println("\n");
	}

	// This is the Template Method
	// Declare this method final to keep subclasses from
	// changing the algorithm
	public final void makeSandwich() {

		cutBun();

		// Call to Hook
		if (customerWantsMeat()) {
			addMeat();
			// Here to handle new lines for spacing
			afterFirstCondiment = true;
		}

		// Call to Hook
		if (customerWantsCheese()) {

			if (afterFirstCondiment) {
				System.out.print("\n");
			}

			addCheese();
			afterFirstCondiment = true;
		}

		// Call to Hook
		if (customerWantsVegetables()) {

			if (afterFirstCondiment) {
				System.out.print("\n");
			}

			addVegetables();

			afterFirstCondiment = true;
		}

		// Call to Hook
		if (customerWantsCondiments()) {

			if (afterFirstCondiment) {
				System.out.print("\n");
			}

			addCondiments();

			afterFirstCondiment = true;
		}

		wrapTheHoagie();
	}
}