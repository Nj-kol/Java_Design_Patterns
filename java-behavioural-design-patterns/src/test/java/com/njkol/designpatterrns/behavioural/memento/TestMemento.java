package com.njkol.designpatterrns.behavioural.memento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMemento {

	private Caretaker caretaker;

	@BeforeEach
	public void setUp() {
		// Create a caretaker that contains all the articles in it
		caretaker = new Caretaker();
	}

	@Test
	public void testMemento() {
		// The originator sets the value for the article,
		// creates a new memento with a new article, and
		// gets the article stored in the current memento
		Originator originator = new Originator();

		originator.set("Are equity markets in a bubble?");
		caretaker.addMemento(originator.storeInMemento());
		originator.set("Best international funds");
		caretaker.addMemento(originator.storeInMemento());
		originator.set("How to create a bond ladder with debt funds");
		caretaker.addMemento(originator.storeInMemento());
		
		System.out.println("The last article is : " + originator.restoreFromMemento(caretaker.getMemento()));
		System.out.println("The last article is : " + originator.restoreFromMemento(caretaker.getMemento()));
		System.out.println("The last article is : " + originator.restoreFromMemento(caretaker.getMemento()));
	}
}
