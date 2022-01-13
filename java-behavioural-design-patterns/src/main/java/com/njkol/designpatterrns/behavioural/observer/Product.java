package com.njkol.designpatterrns.behavioural.observer;

import java.util.HashSet;
import java.util.Set;

public class Product implements Subject {

	private Set<Observer> observers;

	private String productName;
	private String productType;
	String availability;

	public Product(String productName, String productType, String availability) {
		super();
		observers = new HashSet<>();
		this.productName = productName;
		this.productType = productType;
		this.availability = availability;
	}

	public Set<Observer> getObservers() {
		return observers;
	}

	public void setObservers(Set<Observer> observers) {
		this.observers = observers;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	public void notifyObservers() {
		System.out.println("Notifying to all the subscribers when product became available");
		for (Observer ob : observers) {
			ob.update(this.productName, this.availability);
		}
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

}