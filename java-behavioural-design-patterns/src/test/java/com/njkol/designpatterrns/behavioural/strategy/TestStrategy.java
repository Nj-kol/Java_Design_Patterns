package com.njkol.designpatterrns.behavioural.strategy;

import org.junit.jupiter.api.Test;

public class TestStrategy {

	private MathOperationContext ctx;
	
	@Test
	public void testAdd() {
		Strategy st = new OperationAdd();
		ctx = new MathOperationContext(st);
		int res = ctx.executeStrategy(9, 5);
		System.out.println("Result is : "+res);
	}
	
	@Test
	public void testSubtract() {
		Strategy st = new OperationSubstract();
		ctx = new MathOperationContext(st);
		int res = ctx.executeStrategy(9, 5);
		System.out.println("Result is : "+res);
	}
	
	@Test
	public void testMultiply() {
		Strategy st = new OperationMultiply();
		ctx = new MathOperationContext(st);
		int res = ctx.executeStrategy(9, 5);
		System.out.println("Result is : "+res);
	}
}
