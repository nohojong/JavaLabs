package com.nhj.operators;

public class PostfixExample {

	public static void main(String[] args) {

		// syntactic sugar 연산자 : ++, --
		// (후위증가연산자)
		int a = 10;
        int b = a++;  // b는 10이 되고, a는 11이 됩니다.
//      int b= a;   //a값 을  먼저 b에 대입한다. : 원래값으로 평가된다.
//      a=a+1;	  //그런후에,a값을	1 증가함. 그래서 후위증가라고함
        
        int c = 10;
        //int d = c--;  // d는 10이 되고, c는 9가 됩니다.
        int d = c;
        c=c-1;
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("c: " + c + ", d: " + d);
    }
}
		
