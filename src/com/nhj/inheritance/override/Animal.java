package com.nhj.inheritance.override;

public class Animal {
	public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

    // 슈퍼클래스의 메서드
    public Animal speak() {
        System.out.println("Animal makes a sound");
        return this;
    }
}