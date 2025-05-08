package com.nhj.classes.nestedClasses;

import java.util.ArrayList;

import com.nhj.classes.nestedClasses.impl.*;
import com.nhj.classes.nestedClasses.interfaces.Calculate;;


public class ImplMain {
	
	// useHelloWorldInterface 메서드 입장에서는 
	// HelloWorld 인터페이스의 구현체와의 느슨한 결합
	//HelloWorld 인터페이스의 구현체와에 대한 추상화
	public static void useHelloWorldInterface(Calculate helloWorld) {
		helloWorld.add(0, 0);
		helloWorld.subtract(0,0);
		helloWorld.multiply(0,0);
		}

	public static void main(String[] args) {
		
		
	

		// 추상화 개념을 사용하겠다.
		// 또는 느슨한 결합
		Calculate helloWorld1 =
				new OldImplHelloWorld();

		Calculate helloWorld2 =
				new NewImplHelloWorld();
		useHelloWorldInterface(helloWorld1);
		
		useHelloWorldInterface(helloWorld2);
	}

}
