package com.nhj.operators;

public class ShortCircuitingExample {
	
	public static void main(String[] args){
        int value1 = 2;
        int value2 = 2;
        
        // 논리 AND 연산
        
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}


