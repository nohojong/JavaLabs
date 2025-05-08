package com.nhj.inheritance.polymorphism;

class SubClass extends SuperClass {
    // 슈퍼클래스의 필드와 이름이 같은 필드를 선언합니다.
    String field = "Hello";

    void printFields() {
        // 서브클래스의 필드를 참조합니다.
        System.out.println("SubClass field: " + field);
        super.printField();
        // 슈퍼클래스의 필드를 참조합니다.
        System.out.println("SuperClass field using super: " + super.field);
    }
}