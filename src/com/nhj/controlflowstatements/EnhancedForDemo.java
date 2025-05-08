package com.nhj.controlflowstatements;

public class EnhancedForDemo {

	public static void main(String[] args){
		
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        
        // for-each statement
        // 아래의 numbers에 위치하는 것?은 엘리먼트를 가지고 있는 데이터 자료
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
        
        // numbers 에 위치하는 것?은 Iterable 인터페이스를 구현한
        // 구체(클래스)만 올 수 있다.
   }
}
