package com.njkol.designpatterrns.behavioural.command;

public class TurnRadioUp implements Command {

	ElectronicDevice theDevice;
	
	public TurnRadioUp(ElectronicDevice newDevice){
		theDevice = newDevice;
	}
	
	public void execute() {
		theDevice.volumeUp();
	}

	public void undo() {
		theDevice.volumenDown();	
	}
}