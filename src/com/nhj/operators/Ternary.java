package com.nhj.operators;

public class Ternary {

	public static void main(String[] args) {
		
	    int a = 5, b = 10, c = 0;
	        boolean x = true, y = false;
		
		// (a > b) : ()안에서 사용되는 expression은 true 또는 false 값을 만듦.
	    // (expression) : expression 의 값이,
	    //          1. true 이면(?),
	    //             -> ? X : Y ---> ':' 기준으로 왼쪽에 있는 X가 선택된다
	    //          2. false 이면(?),
	    //             -> ? X : Y ---> ':' 기준으로 오른쪽에 있는 Y가 선택
	        
		int ternary = (a > b) ? a : b;
			System.out.println("ternary: (a > b) ? a : b = " + ternary);
			
		int ternary2 = (true) ? a : b;
	}

}
