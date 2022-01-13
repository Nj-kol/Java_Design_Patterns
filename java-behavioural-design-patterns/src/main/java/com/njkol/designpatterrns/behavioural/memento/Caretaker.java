package com.njkol.designpatterrns.behavioural.memento;

//Memento Design Pattern Tutorial

import java.util.LinkedList;

public class Caretaker {

	// Where all mementos are saved
	LinkedList<Memento> savedArticles = new LinkedList<Memento>();

	// Adds memento to the ArrayList
	public void addMemento(Memento m) {
		savedArticles.push(m);
	}

	// Gets the memento requested from the Stack
	public Memento getMemento() {
		return savedArticles.pop();
	}
}