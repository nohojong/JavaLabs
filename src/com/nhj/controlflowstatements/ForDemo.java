package com.nhj.controlflowstatements;

public class ForDemo {
	
	public static void main(String[] args){
    
		// for(반복, 조건식)
		// - 초기화 (반복횟수 카운트 변수) expression
		// - 반복 종료 expression
		// - 증감 (반복횟수 카운트 변수) expression
		for(int i=1; i<11; i++){
             System.out.println("Count is: " +  i);
             // ...
        }
		
		int loopingCount =0;
		for(;;) {
			//...
			if(loopingCount++>10)
				break;
		}
		
		int breakFingure = 7;
		
		int anotherLoopingCount = 0;
		for(;anotherLoopingCount<10;anotherLoopingCount++) {
			//...
			if (anotherLoopingCount ==breakFingure)
				break;
		}
		
		// 위 for 구문의 반복 횟수를 필요로 하는 코드를 작성할때
		int finalLoopingCountNumber = anotherLoopingCount;
   }
}

