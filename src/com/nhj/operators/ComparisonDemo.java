package com.nhj.operators;

class ComparisonDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        
        // if 구문이...if
        // if 다음에 오는(조건식)
        // 이 (조건식) expression : 값을 만든다... 이 값이 true 일때
        // {} <-- : 이연산자의 연산결과는 true 아니면 false
        // == 연산자는 왼쪽 피연산자의 값과 오른쪽 피연산자의 값이 동일한지를 비교하는 동등연산자
        // 동일하다면 true
        // 동일하지않다면, false 라는 값을 만드는 expression!!!
        if(value1 == value2) {
        	// if 문의 블럭에 있는 statement 가 수행되기 위한 조건...
        
            System.out.println("value1 == value2");
        }               
            
        if(value1 != value2) {
            System.out.println("value1 != value2");
        }
        
        if(value1 > value2) {
            System.out.println("value1 > value2");
        }
        
        if(value1 < value2) {
            System.out.println("value1 < value2");                        	
        }
        
        if(value1 <= value2) {
            System.out.println("value1 <= value2");
        }
        
    }
}