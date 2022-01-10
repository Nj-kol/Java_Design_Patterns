package com.njkol.designpatterrns.creational.singleton;

public class LazyBrokenSingleton {

	private static volatile LazyBrokenSingleton instance = null;

	private LazyBrokenSingleton() {
	}

	public static LazyBrokenSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyBrokenSingleton.class) {
				if (instance == null) {
					instance = new LazyBrokenSingleton();
				}
			}
		}
		return instance;
	}
}
