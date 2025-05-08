package com.nhj.variables;

public class MaxMinOfVariables {
	public static void main(String[] args) {
		// Ob 다음에 오는 수는 이진수라는 의미
//		byte byteDataType = 0b0111_1111; // byte 데이터 타입의 최대 양수 값
		// 위 값 0b0111_1111(십진수:127)을 2의 보수로 음수(단, 이진수)로 나타낸다면?
		// ....0b1000_0001(십진수:-127)
		// Type mismatch: cannot convert from int to byte
		// type casting
		// +128의 2의 보수(-128)는 0x80임.
		byte byteDataType = -128; // byte 데이터 타입의 최소 음수 값
		System.out.printf("0x%x \n", byteDataType);
		
		int maxOfIntDataType = 0x7FFF_FFFF; // 양수 최대값
		System.out.printf("0x%x \n", maxOfIntDataType);
		//-2,147,483,648 ~ +2,147,483,647 양수값에 0이포함되기때문에 절대값은 동일하다
		////////////////////////////////////////////////////////////////
		int minOfIntDataType = -2147483648;//0x8000_000; // 양수 최대값
		// 2147483648의 2의 보수 값[0x8000_000]이 minOfIntDataType 저장
		System.out.printf("0x%x \n", minOfIntDataType);
		// 0x8000000
		////////////////////////////////////////////////////////////////
		float simpleFloatVariables = 3.143f; // 부동 소수점...
		double simpleDoubleVariables = 3.14234d;
		
		boolean isTrue = true;
		boolean isFalse = false;
		
		boolean isRet = isTrue || isFalse;
		
		char alphabet = 'A'; // 아스키코드가 아니라 유니 코드
		
		String helloWorld = "Hello World";
		//String helloWorld = new String ("Hello World");
		//System.out.println(helloWorld);
		
		
		int nonDefaltSettingVariable = 0;
//		System.out.printf("0x%x", byteDataType);
		
		Class clazz;
		
		Class<String> stringClass = String.class;// String.class; 라는 특별한 리터럴
		
		int[] studentId;
		studentId = new int[5];
		studentId[0]=1;
		studentId[1]=2;
		studentId[2]=3;
		studentId[3]=4;
		studentId[4]=5;
		
		System.out.println("학생"+studentId[0]);
		System.out.println("학생"+studentId[1]);
		System.out.println("학생"+studentId[2]);
		System.out.println("학생"+studentId[3]);
		System.out.println("학생"+studentId[4]);
		
	}
}