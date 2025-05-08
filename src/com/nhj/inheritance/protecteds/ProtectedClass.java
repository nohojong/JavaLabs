package com.nhj.inheritance.protecteds;

public class ProtectedClass {

	private int age;
	private String name;
	
	public ProtectedClass() {}
	public ProtectedClass(int age,String name) {
		super();
		this.age=age;
		this.name=name;
		
	}
	static protected String staticHelloWorld() {
		return "HelloWorld";
	}
	public String goodBye() {
		return "GoodBye";
	}
	protected String helloWorld() {
		return "HelloWorld";
	}
}
