package com.njkol.designpatterrns.structural.proxy;

public class RealInternet implements Internet {
	 
    @Override
    public void connectTo(String host) {
        System.out.println("Connecting to "+host);
    }
}