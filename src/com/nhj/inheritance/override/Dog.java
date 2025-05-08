package com.nhj.inheritance.override;

public class Dog extends Animal {
	
    // 메서드를 재정의 (override)
    @Override // 오버라이드 어노테이션 등장 ... : 부모 클래스로부터 상속받은 Animal 예를들어
    		  // speak 메서드를 재정의 하겠다라는 의미!!!	
    // 충분희 유사한 기본 동작(close enough)
    // : 슈퍼 클래스의 speak 메서드와 충분히 유사한 기본동작 을 바탕으로,
    // Dog 클래스의 speak 메서드에 필요에 따라 동작을 구체화 하거나 변경하였다
    
    
    public Dog speak() {
    	super.speak();
    	String mungmung = "멍멍";
        System.out.println("Dog barks:"+mungmung);
        return this;
    }
}