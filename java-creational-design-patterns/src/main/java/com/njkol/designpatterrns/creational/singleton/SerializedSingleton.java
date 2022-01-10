package com.njkol.designpatterrns.creational.singleton;

import java.io.Serializable;

/** 
 * The problem with serialized singleton class is that whenever we deserialize it, it will create a new instance of the class.
 * 
 * So it destroys the singleton pattern, to overcome this scenario all we need to do it provide the implementation of readResolve() method
 * 
 * <p>
 * If the class of an object being deserialized defines a readResolve method with the proper declaration, this method is invoked on the newly created object after it is deserialized. 
 * The object reference returned by this method is then returned in place of the newly created object.
 * </p>
 * @author Nilanjan Sarkar
 *
 */
public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private SerializedSingleton() {
	}

	// Lazy initialization holder class idiom for static fields
	// JVM will ensure that this static class is loaded lazily
	private static class Holder {
		private static final transient SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return Holder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
