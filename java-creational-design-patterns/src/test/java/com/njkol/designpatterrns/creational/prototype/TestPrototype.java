package com.njkol.designpatterrns.creational.prototype;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestPrototype {

	@Test
	public void testEmployeePrototype() throws CloneNotSupportedException {

		Employees emps = new Employees();
		emps.loadData();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();

		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}
}
