package com.njkol.designpatterrns.behavioural.command;

public class TurnRadioOn implements Command {

	ElectronicDevice theDevice;
	
	public TurnRadioOn(ElectronicDevice newDevice){
		theDevice = newDevice;
	}
	
	public void execute() {
		theDevice.on();
	}

	public void undo() {
		theDevice.off();	
	}
}