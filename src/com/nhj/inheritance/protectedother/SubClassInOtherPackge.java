package com.nhj.inheritance.protectedother;

import java.util.ArrayList;

import com.nhj.inheritance.protecteds.ProtectedClass;

public class SubClassInOtherPackge extends ProtectedClass{
	ArrayList al;
	public SubClassInOtherPackge() {}
	
	// 상속한 클래스의 메서드에서만 사용 가능함!!!
	public void useProtectedMethod() {
		helloWorld();   // 타패키지의 특정 클래스에서
						// Protected 멤버를 사용하기 위해서는 상속을 해야한다.
					  
		ProtectedClass.staticHelloWorld();
	}
}
