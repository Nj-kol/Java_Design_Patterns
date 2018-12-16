package com.njkol.designpatterrns.structural;

import com.njkol.designpatterrns.structural.composite.Component;
import com.njkol.designpatterrns.structural.composite.Computer;
import com.njkol.designpatterrns.structural.composite.HardDisk;
import com.njkol.designpatterrns.structural.composite.MotherBoard;
import com.njkol.designpatterrns.structural.composite.Ram;
import com.njkol.designpatterrns.structural.flywheel.Circle;
import com.njkol.designpatterrns.structural.flywheel.ShapeFactory;

/**
 *
 * @author Nilanjan Sarkar
 *
 */
public class StructuralClient {

	public static void main(String[] args) {

		testFlyWheel();
	}

	public static void testComposite() {

		Component c1 = new Ram();
		Component c2 = new HardDisk();
		Component c3 = new MotherBoard();
		Computer comp = new Computer();

		comp.addComponent(c1);
		comp.addComponent(c2);
		comp.addComponent(c3);

		comp.showPrice();
	}

	public static void testFlyWheel() {

		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	public static void testDecorator() {

	}
	
	private static final String colors[] = { "Red", "Green", "Blue", "White",
	"Black" };

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
