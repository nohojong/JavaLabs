package com.nhj.string;

public class Main {

	public static void main(String[] args) {
		
//		String str1="Python"; // 리터럴 풀 인 힙 에어리어
//		String str2= new String("Python"); // 인 힙 에어리어: 일반적인 인스턴스임
//		str1.equals(str2);
		/*문자열 객체의 표준 표현을 반환합니다.
		초기에는 비어 있는 문자열 풀은 String 클래스에 의해 비공개적으로 유지됩니다.
		intern 메서드가 호출될 때 equals(Object) 메서드로 확인된 대로 이 문자열 객체와 동일한 문자열이 풀에 이미 있는 경우, 풀의 문자열이 반환됩니다. 그렇지 않으면 이 문자열 객체가 풀에 추가되고 이 문자열 객체에 대한 참조가 반환됩니다.
		따라서 임의의 두 문자열 s와 t에 대해 s.intern() == t.intern()은 s.equals(t)가 참일 때만 참입니다.
		모든 리터럴 문자열과 문자열 값 상수 표현식은 인턴됩니다. */
		String str = "JavaPoint";
		
		String str1 = new String("JavaPoint").intern();
		
//		String str2 = new String("Javapoint");

		return;
	}

}
