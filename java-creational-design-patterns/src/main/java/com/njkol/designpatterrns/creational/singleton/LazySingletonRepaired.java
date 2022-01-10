package com.njkol.designpatterrns.creational.singleton;

public class LazySingletonRepaired {

	private static volatile LazySingletonRepaired instance = null;

	private LazySingletonRepaired() {
		if(instance!=null){
			throw new InstantiationError("Already there");
		}
	}

	public static LazySingletonRepaired getInstance() {
		if (instance == null) {
			synchronized (LazySingletonRepaired.class) {
				if (instance == null) {
					instance = new LazySingletonRepaired();
				}
			}
		}
		return instance;
	}
}
