package com.nhj.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardFixed {

    void foo(List<?> i) {
    	//fooHelper 메서드는 제너리 메서드...
    	// 즉 타입 파라미터의 아규먼트를 유추해야함!!!
    	// i가 List<?>...
        fooHelper(i);
    }


    // Helper method created so that the wildcard can be captured
    // through type inference.
    private <T> void fooHelper(List<T> list) {
       	list.set(0, list.get(1)); // 테스트를 위해 0번째 엘리먼트를 1번째 엘리먼트로 set하는 코드로 변경함
    }
    
    public static void main(String[] args) {
        WildcardError wildcardError = new WildcardError();
        
        // Integer 타입의 리스트 생성 및 초기화
        List<Integer> intList = new ArrayList<>();
        intList.add(42);  // 첫 번째 요소
        intList.add(15);  // 두 번째 요소
        
        System.out.println("Before foo: " + intList);
        wildcardError.foo(intList);
        System.out.println("After foo: " + intList);

        // String 타입의 리스트 생성 및 초기화
        List<String> strList = new ArrayList<>();
        strList.add("Hello");  // 첫 번째 요소
        strList.add("World");  // 두 번째 요소
        
        System.out.println("Before foo: " + strList);
        wildcardError.foo(strList);
        System.out.println("After foo: " + strList);
    }

}