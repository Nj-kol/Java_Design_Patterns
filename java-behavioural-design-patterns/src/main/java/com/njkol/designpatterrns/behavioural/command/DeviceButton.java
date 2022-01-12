package com.njkol.designpatterrns.behavioural.command;

//This is known as the invoker
//It has a method press() that when executed
//causes the execute method to be called

//The execute method for the Command interface then calls 
//the method assigned in the class that implements the
//Command interface
public class DeviceButton {

	private Command theCommand;

	/**
	 * @param theCommand the theCommand to set
	 */
	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void press() {
		if (theCommand != null) {
			theCommand.execute();
		} else {
			throw new RuntimeException("No Command has been set");
		}
	}

	// Now the remote can undo past commands

	public void pressUndo() {
		if (theCommand != null) {
			theCommand.undo();
		} else {
			throw new RuntimeException("No Command has been set");
		}
	}

}