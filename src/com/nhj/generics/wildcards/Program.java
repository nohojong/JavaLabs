package com.nhj.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class Program {
	
	public static void printLists(List<Object> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}
	
    // List<T extends Number> 파라미터에서 컴파일 에러가 발생함
    // 메서드 파라미터 정의에 타입 파라미터 신택스를 사용하고 있음
    // : 상한 제한 와일드 카드로 변경하거나, 무제한 와일드 카드로 변경하거나...
//	public static void printLists(List<T extends Number> list) {
//	    for (Object elem : list)
//	        System.out.println(elem + " ");
//	    System.out.println();
//	}	
	
//	public static void printList(List<? extends Number> list) {
//	    for (Object elem : list)
//	        System.out.println(elem + " ");
//	    System.out.println();
//	}	
	
	// List<?> : 파라미터 list의 아규먼트로,
	//			 List 인터페이스를 구현하 구체의 인스턴스 참조값을 전달받을 것인데,
	//			 이 구체의 엘리먼트에 대한 데이터타입 제한은 없습니다...
	public static void printList(List<?> list) {
		// 알수없는타입 , 제한하지 않는 , 무제한이라고 하는
		// Unbounded 와일드 카드는 오로지,
		// READ만 할 수 있다
	    for (Object elem: list)
	    	System.out.print(elem + " ");
	    System.out.println();
	}
	
	public static void main(String ...args) {
		Class clazz; // ->> (raw type)...
		String str;  // ->> 
		
		
		List<Object> lo = Arrays.asList("HELLO");
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<Double> ld = Arrays.asList(1.0, 2.0, 3.0);
		List<Float> lf = Arrays.asList(1.0f, 2.0f, 3.0f);
		Program.printList(li);
		Program.printList(ld);
		Program.printList(lf);		
		
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(ls);
		
		printLists(lo);
	}
}
