package com.nhj.inheritance.protectedother;

public class Main {

	public static void main(String[] args) {

		SubClassInOtherPackge subClassInOtherPackge = new SubClassInOtherPackge();
		
		// 다음과 같이 타패키지의 특정 클래스를 상속한 클래스의 인스턴스로
		// protected 엑세스 제어자가 적용된 메서드를 사용할수 없음
		//subClassInOtherPackge.helloWorld();
	}

}
