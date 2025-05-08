package com.nhj.inheritance.polymorphism;

public class FieldHidingDemo {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.printFields();

        // 슈퍼클래스 메서드를 통해 슈퍼클래스의 필드에 접근합니다.
        sub.printField();
    }
}