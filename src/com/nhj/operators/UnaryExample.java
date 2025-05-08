package com.nhj.operators;

public class UnaryExample {
	public static void main(String []args) {
		int a = 5, b = 10, c = 0;
        boolean x = true, y = false;
        
	    // unary
        // 전위 증감 연산자 [prefix]
        ++a;// a = a + 1;
	    int preA = ++a; // 값을 증가시키고 , 그 결과를 반환(=)
//	    a = a + 1; //전위 증감 : a의값을 먼저 1증가 시킨후에,
//	    int preA = a;	      preA 변수에 대입한다. 
	    int preB = --b;    // 전위 감소
//	    b= b-1;
//	    int preB = b;
	    int positive = +preA; // + 연산자가 적용된 피연산자의 값을 양수로 만듦
	    
	    int negative = -preB; // - 연산자가 적용된 피연산자의 값을 음수로 만듦
	    
	    int bitwiseNot = ~preA; // ~ 비트와이즈 반전 연산자
	    
	    boolean logicalNot = !x; // 논리 반전 연산자
	    System.out.println("unary: ++a = " + preA + ", --b = " + preB + ", +a = " + positive + ", -b = " + negative + ", ~a = " + bitwiseNot + ", !x = " + logicalNot);
	}
}
