package com.nhj.inheritance.override;

public class Cat extends Animal {
	public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
    // 메서드를 재정의 (override)
    @Override
    public Cat speak() {
    	super.speak();
        System.out.println("Cat meows");
        return this;
    }
}