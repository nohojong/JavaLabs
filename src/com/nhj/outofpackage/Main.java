package com.nhj.outofpackage; // 현재 MAin 클래스가
							  // com.nhj.outofpackage 패키지에 속해있다.

//import com.nhj.variables
//import com.nhj.variables.Bicycle;
//import com.nhj.variables.Dog;

import com.nhj.variables.*;

// Main.java -->Main.class
// java(.exe) -cp . Main(.class) <--- CMD에서 실행시키는 실습을 한적 있음.
public class Main {	
	
	public int iamInstanceVariable; //Main 클래스 객체가 생성 되였을 때 사용!
									//iamIstanceVariable은
									//Main 클래스가 객체가 생성될때 생성됨.
	public static int iamStaticVariable;//Main 클래스 파일이 VM에의해 메모리에 로드되면
										// 라이프 사이클 (생명주기[생성/소멸])이 시작됨
	
//	static {
//		System.out.println("Hello World");
//	}
    
	public static void main(String[] args/*String[] args*/) {
		
		// size : 8bit(msb sign 비트, 나머지 7비트는 절대값)
		byte oneByte = 127; //Type mismatch: cannot convert from int to byte
		byte minusOneByte = -128;
		
		//size : 16bit(sign bit:msb 위치에 있고, 15비트가 절대값을 표현) 
		short oneShort = 32767;
		short minusOneShort = -32768; 
		
		//양의 정수값은 2^31(2,147,483,647)
		int x = 0; // 로컬 변수는 디폴트 값을 지원하지 않는다.
		//지역 변수는 약간 다르며, 컴파일러는 초기화되지 않은 지역 변수에 디폴트 값을 할당하지 않습니다
		//2^63(long)
		long xxx = 2147483648L; // 2147483648 부터 L붙여야함
//		System.out.println(x);
		
		// local[지역] 변수의 라이프 사이클은 main 메서드 호출과 리턴 기간내에만 존재
		int innerVariable = 0;
		
		Car.iamStaticMethod();
		int localVariable = Main.iamStaticVariable;
		
		
		char firstChar = 'H';
		char secondChar = 'e';
		char thirdChar = 'l';
		char forthChar = 'l';
		char fithChar = 'o';
		
		//문자열...
		
		// str은 string 클래스 객체를 참조하는 참조 변수...
		String str = "Hello"; // 문자열 리터럴을 바로 사용할 수 있음 (특수한 literal...)
		// new 연산자와 해당 클래스의 컨스트럭터 호출식을 조합한 코드로 특정 클래스 객체를 생성한다...
		String str2 = new String ("Hello");
		
		return;
//		Bicycle bi;
	}

}
