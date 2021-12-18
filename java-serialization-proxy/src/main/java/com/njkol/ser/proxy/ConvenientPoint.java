package com.njkol.ser.proxy;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ConvenientPoint extends CumbersomePoint implements Serializable {

	public ConvenientPoint(double x, double y, String name) {
		super(x, y, name);
	}

	// Serialization proxy for ConvenientPoint
	private static class SerializationProxy implements Serializable {

		private String name;
		private double x;
		private double y;

		public SerializationProxy(ConvenientPoint point) {
			this.name = point.getName();
			this.x = point.getX();
			this.y = point.getY();
		}

		private Object readResolve() {
			return new ConvenientPoint(x, y, name);
		}
	}

	// writeReplace method for the serialization proxy pattern
	private Object writeReplace() {
		return new SerializationProxy(this);
	}

	// readObject method for the serialization proxy pattern
	private void readObject(ObjectInputStream stream) throws InvalidObjectException {
		throw new InvalidObjectException("Proxy required");
	}
}