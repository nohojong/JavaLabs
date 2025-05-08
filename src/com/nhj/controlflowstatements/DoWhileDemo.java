package com.nhj.controlflowstatements;

public class DoWhileDemo {
	
	public static void main(String[] args){
        int count = 11;
        
        do {
        	
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11); // 첫번째 반복시에 while 조건식 값이
                              // false 가 되더라도
                              // 한번은,,,do...while 블럭의 스테이트먼트가 수행됌.
        
        //while 조건식의 값이 false 가 되면,
        //while 블럭의 next 스테이트먼트로 실행 순서가 이루어진다.
        
        System.out.println();
	
	}
}
