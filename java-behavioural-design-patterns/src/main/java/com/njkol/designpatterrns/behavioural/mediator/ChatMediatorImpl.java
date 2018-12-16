package com.njkol.designpatterrns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Notice that send() method is using mediator to send the message to the users 
 * and it has no idea how it will be handled by the mediator.
 * 
 * @author Nilanjan Sarkar
 *
 */
public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;
	
	public ChatMediatorImpl(){
		this.users=new ArrayList<>();
	}
	
	@Override
	public void addUser(User user){
		this.users.add(user);
	}
	
	@Override
	public void sendMessage(String msg, User user) {
		for(User u : this.users){
			//message should not be received by the user sending it
			if(u != user){
				u.receive(msg);
			}
		}
	}
}