package com.nhj.classes.nestedClasses.inter;

public class HelloWorld implements GoodBye {

	@Override
	public void goodBye(String firstName, String secondName) {
		System.out.println(firstName+secondName);
	}

}