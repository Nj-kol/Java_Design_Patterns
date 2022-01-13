package com.njkol.designpatterrns.behavioural.observer;

import java.io.Serializable;

public class Customer implements Observer, Serializable {
	 
	private static final long serialVersionUID = 2335848954173014093L;
	
	private final int id;
	private final String personName;
 
    public Customer(int id,String personName) {
    	this.id=id;
        this.personName = personName;
    }
 
    public int getCustomerId() {
        return id;
    }
    public String geCustomerName() {
        return personName;
    }
 
    public void update(String productName,String availabiliy) {
        System.out.println("Hello "+personName+", " + productName + " is now "+availabiliy+" on flipkart");
    }
	
}