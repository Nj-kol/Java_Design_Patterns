package com.njkol.designpatterrns.structural.composite;

import org.junit.jupiter.api.Test;

public class TestComposite {

	@Test
	public void testComposite() {

		Component c1 = new Ram();
		Component c2 = new HardDisk();
		Component c3 = new MotherBoard();
		Computer comp = new Computer();

		comp.addComponent(c1);
		comp.addComponent(c2);
		comp.addComponent(c3);

		comp.showPrice();
	}

}
