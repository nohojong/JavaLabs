package com.nhj.classes.nestedClasses;

public class DataStructure {
    
    // Create an array
	// 자바의 상수를 만드는 방법
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        
        // Print out values of even indices of the array
    	// EvenIterator  인스턴스를 생성하고 이 인스턴스 참조 변수를 사용해야하는데...
    	// DataStructureInterator 인스턴스 참조 변수를 사용하고 있음.
        DataStructureIterator iterator = this.new EvenIterator();
        //EvenIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    
    // E 라는것은 제너릭의 타입 파라미터 라고 함. 
	// public interface Iterator<E> {
	// public boolean hasNext();
	// E Next ();}
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { //Iterator<Integer>
    																	  // integer는 타입 아규먼트
        } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        // 가상 메서드라함은 ,메서드 선언만 전재하고 해당 선언된 메스드의 바디는 없음.
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}