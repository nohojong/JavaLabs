package com.nhj.classes;

import java.awt.Point;

// Implicit super constructor Bicycle() is undefined 
// for default constructor.
// Must define an explicit constructor
public class MountainBike extends Bicycle
						implements HelloWorldIterface  {
	
	//Point point;
	// MountainBike 하위 클래스는 하나의 필드를 가집니다.
    private int seatHeight;

    // MountainBike 하위 클래스는 하나의 생성자를 가집니다.
    public MountainBike(int seatHeight, int Cadence,
                        int Speed, int Gear) {
        super(Cadence, Speed, Gear);
        this.seatHeight = seatHeight;
       
    }   
    
    
    
    // MountainBike 하위 클래스는 하나의 메서드를 가집니다.
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
    //@Override
    public void helloWorld() {
    	System.out.println("MountainBike HelloWorld");
    }
    private class InnerClass{
    	
    }
}

    
    