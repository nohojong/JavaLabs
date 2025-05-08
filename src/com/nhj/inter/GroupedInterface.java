package com.nhj.inter;


public interface GroupedInterface extends Interface1, Interface2, Interface3 {

	// public static final 
	double E = 2.718282; // 이필드는 GroupedInterface 를 구현했을때만 쓸수있다

    // 멤버레벨에서 사용할수 있는 엑세스 제어자는 public, private
    public default void helloWorld() {
    	System.out.println("Hello World");
    }
    
    // default로 package-pivate이 아님!
    // default로 public 임!! 
    public static void gooBye() {
    	System.out.println("Good Bye");
    }
}
