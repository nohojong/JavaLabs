package com.nhj.controlflowstatements;

public class WhileDemo {
	
	public static void main(String[] args){
		
        int loopingCount = 1; // for 구문에서 int i=1;
        
        // while(expression) 의 조건식이 true 이면
        // while 블럭의 statement(s) 들을 수행한다.
        // 언제까지? while 의 조건식이 true 이면 계속해서
        // while 블럭의 statement(s) 들을 수행한다.
        while (loopingCount < 11/*for 구문에서 i<11*/) {
        	
            System.out.println("Count is: " + loopingCount);
            
            loopingCount++; // for 구문에서 i++
        }
    }
}
