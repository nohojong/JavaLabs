package com.nhj.variables;

// Public, Private, Protected, Private-Package(또는 Default)
// Class Level, Property [Field, Constructor, Method] Level
// Private-Package(또는 Default) Access Modifier(제어자)
public class Program {
	private int counts;
	
//	private int counts;
	
	//인스턴스 메서드
	public static void printFunc() {
		System.out.println("hello world");
	}
	
	// VM이 호출하는 특수한 static 매서드임.
	// void 키워드도 자바의 Primitive Data Type!!!
	// main 메서드가 VM에게 전달하는 리턴 값은 void. 
	// 그리고 우리의 자바 프로그램은 종료된다.
	public static void main(String[] args) {
		
		 System.out.println("hellow world");
 
		 
		 // static method인 main은 같은 클래스의 멤버인, 인스턴스 메서드를 호출할수 없음
		 printFunc();
		 
		 Program pro = new Program();
//		Car.iamStaticMethod();
//		
//		System.out.println("Hello World");
		
		
		//Bicycle 클래스 객체 참조 변수 (지역 변수:main 메서드 내에서 선언했기 때문에)
		Bicycle bi = new Bicycle (2,3);
		
		// 	main 매서드의 리턴값의 데이터 타입이 void 이므로,
		// 	다음 return 키워드를 생략할 수 있음.
		//	return;
		
//		Car myCar = new Car(1,2,3,4);
//		
//		myCar.setKind(1);
//		myCar.setModel(2);
//		myCar.setPrice(3);
//		myCar.setVendor(4);
//		
//		myCar.getKind();
//		myCar.getModel();
//		myCar.getPrice();
//		myCar.getVendor();
//		
		
		//String 
//		System.out.println(0+ myCar.getKind());
//		System.out.println(0+ myCar.getModel());
//		System.out.println(0+ myCar.getPrice());
//		System.out.println(0+ myCar.getVendor());
	}

}
