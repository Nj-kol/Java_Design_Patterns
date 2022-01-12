package com.njkol.designpatterrns.behavioural.command;

public class TurnRadioOff implements Command {

	ElectronicDevice theDevice;
	
	public TurnRadioOff(ElectronicDevice newDevice){
		theDevice = newDevice;
	}
	
	public void execute() {
		theDevice.off();
	}

	// Used if you want to allow for undo
	// Do the opposite of execute()
	
	public void undo() {
		theDevice.on();
	}
}