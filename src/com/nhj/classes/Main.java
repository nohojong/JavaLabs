package com.nhj.classes;

public class Main {

	public static void main(String[] args) {

		
		// console은 standard out 이라고 함
		// 다음의 println 메서드는 문자열을 콘솔에 출력하는 메서드임
		// %d : d는 decimal(십진수)
		// printf(String format, Object ... args)
		System.out.printf("my age is %d %s \r\n", 51,"hi");
		System.out.printf("my age is 0x%x \r\n", 51);
		System.out.printf("원주율 %f \r\n", Math.PI );
		System.out.printf("hello : %s \r\n","world");
		
		System.out.println();
		System.out.println("hello world");
		System.out.println("good-bye");
		
	}

}
