package com.nhj.operators;

public class ConditionalDemo1 {
	
	public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        
        boolean isTrue; //true 또는 false
        
        // && 연산자 : 논리 and 연산
        // true and true = true
        // true and false = false
        // false and false = false
        if((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }
        
        // || 연산자 : 논리 or 연산
        // true or true = true
        // true or false = true
        // false or false = false
        if((value1 == 1) || (value2 == 1)) {
            System.out.println("value1 is 1 OR value2 is 1");
        }
    }
}

