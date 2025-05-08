package com.nhj.variables;

public class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray /*= new int[10]*/;

        // allocates memory for 10 integers
        // 배열은 동일한 데이터 타입의 엘리먼트들을 가지는 데이터 구조..
        anArray = new int[10]; // 각 엘리먼트의 데이터타입은 int이고 개수가 10개인
           						 // 배열을 만드는 문법
        // initialize first element
        // 배열의 각각의 엘리먼트는 인덱스가 주어진다
        // : 각 엘리먼트에는 배열내에서 어떤 위치 순서가 주어진다
        anArray[0] = 100; // 배열의 각 엘리먼트의 값을 설정하는 문법
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        //새로운 배열을 만든 이유 anArray 배열의 값이 1100인 엘리먼트를 추가하고싶은데...
        
        int[] anArray11 = new int[11];
        // Source : 
        System.arraycopy(anArray, 0, anArray11, 0, 10);
        
        anArray11[10] = 1100;
        //인데스가 10인 엘리먼트는 없는데,
        //인덱스가 10인 엘리먼트에 특정 값을 할당하려고 하니,
        //out of bounds 예외가 발생
        // anArray[10] = 0;
        int temp = anArray[0];
        temp = anArray[1];
        temp = anArray[2];
        temp = anArray[3];
        temp = anArray[4];
        temp = anArray[5];
        temp = anArray[6];
        temp = anArray[7];
        temp = anArray[8];
        temp = anArray[9];
     
        
        
        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
}