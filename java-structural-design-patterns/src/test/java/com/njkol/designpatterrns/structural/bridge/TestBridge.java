package com.njkol.designpatterrns.structural.bridge;

import org.junit.jupiter.api.Test;

public class TestBridge {
	  
	@Test
	public void tesTvtDeviceWithBasicRemote() {
		Device device = new Tv();
	    System.out.println("Test TV with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();
	}
	
	@Test
	public void testTvtDeviceWithAdvancedRemote() {
		Device device = new Tv();
	    System.out.println("Test TV with advanced remote.");
	    AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
	}
	
	@Test
	public void testRadiotDeviceWithBasicRemote() {
		Device device = new Radio();
	    System.out.println("Test Radio with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();
	}
	
	@Test
	public void testRadioDeviceWithAdvancedRemote() {
		Device device = new Radio();
	    System.out.println("Test TV with advanced remote.");
	    AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
	}
}
