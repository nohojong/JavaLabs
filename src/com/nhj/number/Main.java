package com.nhj.number;

public class Main {
	
	public static void callByValueMethod(Integer argu) {
		argu = 3; 	// IntegerCache 클래스에 의해 생성된
					// 256개의 Integer 클래스 인스턴스들중에 , 
					// value 필드의 값이
					// 3인 인스턴스 참조값이 argu 에 저장됨...
					// 그런데 , 이 argu 파라미터는 로컬변수임
					// 이 로컬 변수는 callByValueMethod 메서드가
					// 리턴하는 순간 소멸됨.
		int max = Integer.MAX_VALUE;
		return;
	}
	
	static {
		String[] strs = new String[10];
		for (int i=0;i<strs.length;i++) {
			strs[i] = new String("")+i;
		}
		//intValue : 참조 변수 -> 참조값을 값으로 가지는...
		//public static Integer valueOf(int i)
		//Integer.valueOf 가 호출됨!!!
		//Integer.valueOf(3):AutoBoxing 함
		Integer intV= Integer.valueOf(5);
		Integer intV2= Integer.valueOf(3);
		int ret = intV.compareTo(intV2);
		intV.doubleValue();
		Double doubleValue=3.0d;
		doubleValue.intValue();
		int unboxingInteger = intV;//intV.intValue()
		
		double unboxingDouble = doubleValue;
	}

	public static void main(String ...args) {
		Integer.parseInt("123", 37);
		Integer arg = 10;
		// arg 의 참조값은 IntegerCache 클래스에 의해 생성된
		// 256개의 Integer 클래스 인스턴스들중에 , value 필드의 값이
		// 10인 인스턴스 참조값이다.
		callByValueMethod(arg);

	}
}
