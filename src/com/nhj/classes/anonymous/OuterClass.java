package com.nhj.classes.anonymous;

public class OuterClass {
	
	public void myFourthMethod() {
		int a = 0;
		int b = 0;
		System.out.println("Last In...");
	}

	public void myThirdMethod() {
		int a = 0;
		int b = 0;
		myFourthMethod();
	}
	
	public void mySecondMethod() {
		int a = 0;
		int b = 0;
		myThirdMethod();
	}
	
	public Runnable myMethod() {
		// 블럭...
		// 블럭 number 가 선언되어 있음.
		// myMethod가 호출되면, 
		// myMethod 메서드를 위한 stack frame 메모리 공간이 자동으로 생성된다.
		// 그리고 myMethod 메서드 블럭에서 선언된 지역 변수는
		// 자동으로 이 stack frame이라는 메모리 공간에 할당된다
		// 이 number가 실제 stack frame 공간에 할당(저장)
        int number = 10; // final 또는 사실상 final이 아님
        int count = 0;

        // 익명 클래스 선언
        // 다음 익명 클래스 정의가 myMethod 소스 코드에 있다고 해서,
        // myMethod의 stack farame에 해당 익명 클래스 정의 바이트 코드가 있지 않음.
        // 익명 클래스의 인스턴스가 만들어진다.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            	// run을 위한 스택 프레임 메모리 공간...
                // number 변수에 접근하려고 하면 컴파일 오류 발생
                System.out.println(number);
               // number = 10; //값만 가져온다 스택순서에따라 로컬변수가 없을수도 있기때문에...
            }
        };       
       
        return runnable;
    }
	public static void callByValue (int Value) {
		Value=0;
		
	}

    public static void main(String[] args) {
    	
    	int callByValue = 10;
		callByValue(callByValue);
		
    	System.out.println("First In");
        OuterClass outer = new OuterClass();
        
        Runnable runable = outer.myMethod();
        
        runable.run();/////////////////////////        
    }

}