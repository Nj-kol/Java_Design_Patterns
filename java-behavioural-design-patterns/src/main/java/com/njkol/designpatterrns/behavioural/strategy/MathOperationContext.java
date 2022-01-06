package com.njkol.designpatterrns.behavioural.strategy;

public class MathOperationContext {
	
	private Strategy strategy;

	public MathOperationContext(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
