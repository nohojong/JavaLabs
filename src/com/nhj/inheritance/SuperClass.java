package com.nhj.inheritance;

public class SuperClass {
    private String secret = "슈퍼클래스의 비밀";

    protected class Inner {
        void showSecret() {
            System.out.println("접근된 비밀: " + secret); // ✅ 내부에서 접근 가능
            String hello = "HELLO";
        }
    }
}