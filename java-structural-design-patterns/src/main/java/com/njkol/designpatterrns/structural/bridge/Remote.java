package com.njkol.designpatterrns.structural.bridge;

public abstract class Remote {

	// Composition - implementor
	protected Device device;

	// Constructor with implementor as input argument
	public Remote(Device d) {
		this.device = d;
	}

	abstract public void power();

	abstract public void volumeDown();

	abstract public void volumeUp();

	abstract public void channelDown();

	abstract public void channelUp();
}
