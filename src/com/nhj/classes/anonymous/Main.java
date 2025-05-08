package com.nhj.classes.anonymous;

public class Main {

	public static void main(String[] args) {

		HelloWorld helloWorld =
				new ImplHelloWorld();
		// 이런식은 가능하지 않습니다
		//helloWorld();
	}

}
