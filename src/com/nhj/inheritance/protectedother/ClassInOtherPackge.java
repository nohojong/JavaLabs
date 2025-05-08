package com.nhj.inheritance.protectedother;

import com.nhj.inheritance.protecteds.ProtectedClass;

public class ClassInOtherPackge {

	private ProtectedClass pc;
	
	public ClassInOtherPackge() {
		pc=new ProtectedClass();
	}
	
	public void useGoodBueOfProtectedClass() {
		pc.goodBye();
	}
	
	public void useHelloWorldOfProtectedClass() {
//		pc.helloWorld();// 현재 ClassInOtherPackge 클래스 입장에서는
						// helloworld 메서드의 엣세스 제어자는 마치 Packge-private으로
						// 선언된 것 같다.. 하지만,,,
	}
	
}
