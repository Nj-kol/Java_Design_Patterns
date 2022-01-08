package com.njkol.designpatterrns.structural.bridge;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super(device);
		this.device = device;
	}
	
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }	
}
