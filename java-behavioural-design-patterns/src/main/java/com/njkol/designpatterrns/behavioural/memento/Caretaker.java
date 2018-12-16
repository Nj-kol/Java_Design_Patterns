package com.njkol.designpatterrns.behavioural.memento;

/**
 * An API for Caretaker object 
 * 
 * @author Nilanjan Sarkar
 *
 */
public interface Caretaker<T> {

	public void save(Originator<T> org);

	public void undo(Originator<T> org);
}
