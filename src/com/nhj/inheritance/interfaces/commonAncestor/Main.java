package com.nhj.inheritance.interfaces.commonAncestor;

public class Main {

	public void noInheritanceStaticMethodOfInterface() {
		SuperInterface.HelloWorld();
		// 인터페이스의 정적 메서드는 상속되지 않음
		SubInterface.goodBye();
	}
	
	public static void main(String[] args) {

	}

}
