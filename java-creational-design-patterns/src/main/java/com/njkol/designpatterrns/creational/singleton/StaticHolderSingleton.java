package com.njkol.designpatterrns.creational.singleton;

/**
 * 
 * This technique is also called Bill Pugh's Singleton
 *
 */
public class StaticHolderSingleton {

	private StaticHolderSingleton() {}
	
	// Lazy initialization holder class idiom for static fields
	// JVM will ensure that this static class is loaded lazily
	private static class Holder {
		 private static final StaticHolderSingleton INSTANCE = new StaticHolderSingleton();
	}

	public static StaticHolderSingleton getInstance() {
		return Holder.INSTANCE;
	}
}
