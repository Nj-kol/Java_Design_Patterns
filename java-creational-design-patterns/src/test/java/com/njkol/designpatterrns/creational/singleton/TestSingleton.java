package com.njkol.designpatterrns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

public class TestSingleton {

	@Test
	public void testBreakSingletonUsingReflection() {
		assertDoesNotThrow(() -> loadBrokenSingleton("com.njkol.designpatterrns.creational.singleton.LazyBrokenSingleton"),
				"Loading Broken Singleton should not error");
	}

	@Test
	public void testStopBreakSingletonUsingReflection() {
		assertThrows(InvocationTargetException.class,
				() -> loadFixedSingleton("com.njkol.designpatterrns.creational.singleton.LazySingletonRepaired"),
				"Loading Singleton second time should throw error");
	}

	private void loadBrokenSingleton(String className) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		LazyBrokenSingleton instanceOne = LazyBrokenSingleton.getInstance();
		LazyBrokenSingleton instanceTwo = null;
		// load class
		Class c = Class.forName(className);
		// Get all constructors (whether public or private)
		Constructor[] constructors = c.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			// Below code will destroy the singleton pattern
			constructor.setAccessible(true);
			instanceTwo = (LazyBrokenSingleton) constructor.newInstance();
			break;
		}
		System.out.println("Hashcode of first singleton :" + instanceOne.hashCode());
		System.out.println("Hashcode of second singleton :" + instanceTwo.hashCode());
	}

	private void loadFixedSingleton(String className) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		LazySingletonRepaired instanceOne = LazySingletonRepaired.getInstance();
		LazySingletonRepaired instanceTwo = null;
		// load class
		Class c = Class.forName(className);
		// Get all constructors (whether public or private)
		Constructor[] constructors = c.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			// Below code will destroy the singleton pattern
			constructor.setAccessible(true);
			instanceTwo = (LazySingletonRepaired) constructor.newInstance();
			break;
		}
		System.out.println("Hashcode of first singleton :" + instanceOne.hashCode());
		System.out.println("Hashcode of second singleton :" + instanceTwo.hashCode());
	}
}
