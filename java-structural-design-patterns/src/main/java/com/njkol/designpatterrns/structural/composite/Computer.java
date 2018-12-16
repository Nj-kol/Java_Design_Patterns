package com.njkol.designpatterrns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Composite object
 * 
 * @author Nilanjan
 *
 */
public class Computer implements Component {

	private List<Component> componets = new ArrayList<Component>();

	public void showPrice() {

	  for(Component com: componets){
		  com.showPrice();
	  }
	}

	public void addComponent(Component comp) {
		componets.add(comp);
	}

	public void remove(Component comp) {
		componets.remove(comp);
	}

	// removing 
	public void clear() {
		System.out.println("Clearing all Components");
		this.componets.clear();
	}
}
