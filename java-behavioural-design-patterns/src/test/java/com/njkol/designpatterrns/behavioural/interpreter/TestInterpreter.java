package com.njkol.designpatterrns.behavioural.interpreter;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInterpreter {

	private Context ctx;
	
	@BeforeEach
	public void createfakeData() {
		List<Row> list = new ArrayList<>();
		list.add(new Row("John", "Doe"));
		list.add(new Row("Jan", "Kowalski"));
		list.add(new Row("Dominic", "Doom"));
		ctx = new Context("people", list);
	}

	@Test
	public void testSelectAll() {
		Expression query2 = new Select("*", new From("people"));
		List<String> result2 = query2.interpret(ctx);
		System.out.println(result2);
	}
	
	@Test
	public void testSelectName() {
		
		Expression query = new Select("name", new From("people"));
		List<String> result = query.interpret(ctx);
		System.out.println(result);
	}
	
	@Test
	public void testSelectWithWhere() {
		Expression query3 = new Select("name",
				new From("people", new Where(name -> name.toLowerCase().startsWith("d"))));
		List<String> result3 = query3.interpret(ctx);
		System.out.println(result3);
	}

}
