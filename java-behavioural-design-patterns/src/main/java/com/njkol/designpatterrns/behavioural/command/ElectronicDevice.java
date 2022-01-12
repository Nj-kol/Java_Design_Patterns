package com.njkol.designpatterrns.behavioural.command;

/**
 * An abstract Receiver
 * @author RSI
 *
 */
public interface ElectronicDevice {
	
	public void on();
	
	public void off();
	
	public void volumeUp();
	
	public void volumenDown();
	
}