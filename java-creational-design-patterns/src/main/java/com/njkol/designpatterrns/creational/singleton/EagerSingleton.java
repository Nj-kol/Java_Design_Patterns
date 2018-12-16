package com.njkol.designpatterrns.creational.singleton;

public class EagerSingleton {

	private static volatile EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {

	}

	public synchronized static EagerSingleton getInstance() {
		return instance;
	}

}
