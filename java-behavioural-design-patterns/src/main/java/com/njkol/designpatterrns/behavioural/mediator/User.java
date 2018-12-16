package com.njkol.designpatterrns.behavioural.mediator;

/**
 * Colleague Interface
 * 
 * Notice that User has a reference to the mediator object, it’s required for the communication between different users
 * 
 * @author Nilanjan Sarkar
 *
 */
public abstract class User {
	
	protected ChatMediator mediator;
	protected String name;
	
	public User(ChatMediator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	public abstract void receive(String msg);
}