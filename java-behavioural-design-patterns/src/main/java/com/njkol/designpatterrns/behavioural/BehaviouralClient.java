package com.njkol.designpatterrns.behavioural;

import com.njkol.designpatterrns.behavioural.mediator.ChatMediator;
import com.njkol.designpatterrns.behavioural.mediator.ChatMediatorImpl;
import com.njkol.designpatterrns.behavioural.mediator.User;
import com.njkol.designpatterrns.behavioural.mediator.UserImpl;
import com.njkol.designpatterrns.behavioural.memento.Caretaker;
import com.njkol.designpatterrns.behavioural.memento.FileWriterOriginator;
import com.njkol.designpatterrns.behavioural.memento.GenericCaretaker;
import com.njkol.designpatterrns.behavioural.memento.Originator;
import com.njkol.designpatterrns.behavioural.strategy.Context;
import com.njkol.designpatterrns.behavioural.strategy.OperationAdd;
import com.njkol.designpatterrns.behavioural.template.Cricket;
import com.njkol.designpatterrns.behavioural.template.Football;
import com.njkol.designpatterrns.behavioural.template.Game;

/**
 * A client to test all Behavioural design patterns
 * 
 * @author Nilanjan Sarkar
 *
 */
public class BehaviouralClient {

	public static void main(String[] args) {

		// testStrategy();
		// testTemplate();
		//testMemento();
		testMediator();
	}

	public static void testStrategy() {

		Context context = new Context(new OperationAdd());
		int sum = context.executeStrategy(2, 2);
		System.out.println(sum);
	}

	public static void testTemplate() {

		Game game = new Cricket();
		game.play();
		System.out.println("\n");
		game = new Football();
		game.play();
	}

	public static void testMemento() {

		Caretaker<String> caretaker = new GenericCaretaker();
		Originator<String> orignator = new FileWriterOriginator("data.txt");

		// Set current state
		orignator.setState("First Set of Data\n");
		
		// Save current state
		caretaker.save(orignator);
		System.out.println("Checking content after first write : " + "\n" + orignator + "\n");

		// Now write something else
		orignator.setState("Second Set of Data\n");
		System.out.println("Checking content after second write : " + "\n" + orignator + "\n");

		// Let's undo to last save
		caretaker.undo(orignator);

		// Checking file content again
		System.out.println("Checking content after undo : " + "\n" + orignator + "\n");
	}
	
	public static void testMediator() {
		
		ChatMediator mediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
	}
}