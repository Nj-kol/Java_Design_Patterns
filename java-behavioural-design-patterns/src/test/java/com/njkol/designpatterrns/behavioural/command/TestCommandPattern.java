package com.njkol.designpatterrns.behavioural.command;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCommandPattern {

	// The invoker
	private DeviceButton invoker;
	
	@BeforeEach
	public void performSetUp() {
		 invoker = new DeviceButton();
	}

	@Test
	public void testTv() {

		// Receiver of type TV
		ElectronicDevice newDevice = new Television();

		// TurnTVOn contains the command to turn on the tv
		// When execute() is called on this command object
		// it will execute the method on() in Television
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		invoker.setTheCommand(onCommand);
		invoker.press();

		TurnTVOff offCommand = new TurnTVOff(newDevice);
		invoker.setTheCommand(offCommand);
		invoker.press();
		
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		invoker.setTheCommand(volUpCommand);
		// Execute the same command multiple times
		invoker.press();
		invoker.press();
		invoker.press();
	}
	
	@Test
	public void testRadio() {
		
		// Receiver of type Radio
		ElectronicDevice newDevice = new Radio();
		
		TurnRadioOn onCommand = new TurnRadioOn(newDevice);
		invoker.setTheCommand(onCommand);
		invoker.press();

		TurnRadioOff offCommand = new TurnRadioOff(newDevice);
		invoker.setTheCommand(offCommand);
		invoker.press();
		
		TurnRadioUp volUpCommand = new TurnRadioUp(newDevice);
		invoker.setTheCommand(volUpCommand);
		// Execute the same command multiple times
		invoker.press();
		invoker.press();
		invoker.press();	
	}
	
	@Test
	public void testUndoCommand() {
		// Receiver of type Radio
		ElectronicDevice newDevice = new Radio();
		
		TurnRadioUp volUpCommand = new TurnRadioUp(newDevice);
		invoker.setTheCommand(volUpCommand);
		// Execute the same command multiple times
		invoker.press();
		invoker.press();
		invoker.press();
		
		invoker.pressUndo();
	}
	
	@Test
	public void testNoCommandSet() {
		// Receiver of type Radio
		ElectronicDevice newDevice = new Radio();
		
		TurnRadioOn onCommand = new TurnRadioOn(newDevice);
		assertThrows(RuntimeException.class,() -> invoker.press());
	}		
}
