package com.nhj.inter;

//ClientRelatbleInterface는 슈퍼 클래스(부모 클래스)로 Object 클래스를 확장(상속)함...
public class ClientRelatbleInterface /*extends Object*/ {	
	
	// Generic...
	// Class Object is the root of the class hierarchy. 
	// Every class has Object as a super class(부모 클래스).
	// 자바에서는 다중 상속을 지원하지 않기 때문에,
	// 두 클래스가 상속 관계이 있다라고 함은, 한 클래스는 부모 클래스이고 다른 클래스는 자식 클래스
	// findLargest 메서드 호출자가 이 메서드 아규먼트로 Relatable 참조 변수의 값을 전달
	// object1에는 Relatable 참조 변수의 값이 대입되었다...
	// Object object1의 의미는? Object 클래스 객체의 인스턴스에 대한 참조 값을 저장하는 참조변수...
	public static Object findLargest(Object object1, Object object2) {
	   Relatable obj1 = (Relatable)object1; // 형 변환(type casting)
	   Relatable obj2 = (Relatable)object2; // 형 변환(type casting)
	   if (obj1.isLargerThan(obj2) > 0)
	      return object1;
	   else 
	      return object2;
	}
	
	public static Object findSmallest(Object object1, Object object2) {
	   Relatable obj1 = (Relatable)object1;
	   Relatable obj2 = (Relatable)object2;
	   if (obj1.isLargerThan(obj2) < 0)
	      return object1;
	   else 
	      return object2;
	}

	public static boolean isEqual(Object object1, Object object2) {
	   Relatable obj1 = (Relatable)object1;
	   Relatable obj2 = (Relatable)object2;
	   if ( (obj1).isLargerThan(obj2) == 0)
	      return true;
	   else 
	      return false;
	}

}