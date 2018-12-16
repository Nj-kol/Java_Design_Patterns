package com.njkol.designpatterrns.behavioural.memento;


/**
 * The Caretaker object which contains the saved state
 * 
 * @author Nilanjan Sarkar
 *
 */
public class GenericCaretaker implements Caretaker<String> {

	private Memento memento;

	@Override
	public void save(Originator<String> org) {
		this.memento=org.persistState();
	}

	@Override
	public void undo(Originator<String> org) {
		org.undoState(memento);
	}
}