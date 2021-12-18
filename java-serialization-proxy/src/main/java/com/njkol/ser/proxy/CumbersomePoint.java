package com.njkol.ser.proxy;

public class CumbersomePoint {

    private String name;

    private double x;

    private double y;

    protected CumbersomePoint(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
    
}