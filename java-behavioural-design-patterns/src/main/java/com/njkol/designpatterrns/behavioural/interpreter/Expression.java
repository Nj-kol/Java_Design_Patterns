package com.njkol.designpatterrns.behavioural.interpreter;

import java.util.List;

public interface Expression {
	List<String> interpret(Context ctx);
}
