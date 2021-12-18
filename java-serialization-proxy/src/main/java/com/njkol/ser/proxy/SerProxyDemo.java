package com.njkol.ser.proxy;

import java.io.IOException;

public class SerProxyDemo {

	public static void main(String[] args) {

		String fileName = "subclass.ser";

		ConvenientPoint subClass = new ConvenientPoint(10, 20, "PointA");

		try {
			SerializationUtil.serialize(subClass, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		try {
			ConvenientPoint subNew = (ConvenientPoint) SerializationUtil.deserialize(fileName);
			System.out.println("SubClass read = " + subNew);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
