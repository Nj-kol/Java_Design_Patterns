package com.njkol.designpatterrns.behavioural.interpreter;

import java.util.List;

public abstract class Criteria {

	protected String attributeName;
	protected String operator;
	protected List<String> attributeValue;
	
	protected abstract String interpret(Alert ac);
			
}
