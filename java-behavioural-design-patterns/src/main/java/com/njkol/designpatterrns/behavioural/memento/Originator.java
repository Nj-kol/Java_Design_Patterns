package com.njkol.designpatterrns.behavioural.memento;

/**
 * An API for Originator object
 * 
 * @author Nilanjan Sarkar
 *
 */
public interface Originator<T> {

	public void setState(T str);
	public Memento persistState();
	public void undoState(Memento memento);
}
