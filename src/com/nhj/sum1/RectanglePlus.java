package com.nhj.sum1;

import java.awt.Point;


public class RectanglePlus implements Relatable {

    // 생략
    // ...
       
    public RectanglePlus(Point pi, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	// a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
        
    	if (this.getArea() < other.getArea())
            return -1;
        else if (this.getArea() > other.getArea())
            return 1;
        else
            return 0;               
    }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}