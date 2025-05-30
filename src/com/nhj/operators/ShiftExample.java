package com.nhj.operators;

public class ShiftExample {
	public static void main(String []args) {
		
		int a = 5, b = 10, c = 0;
		// LSB : b[0]
		// MSB : b[31]
		// a : 0b0000_0000_0000_0000_0000_0000_0000_0101
// shiftLeft : 0b0000_0000_0000_0000_0000_0000_0000_1010
		// b[0] : 0
		// b[1] <- b[0]
		// b[2] <- b[1]
		// b[4] <- b[3]
		// b[5] <- b[4]
		// ...
		// 버린다 <- b[31]
		int shiftLeft = a << 1;
		
// shiftRight: 0b0000_0000_0000_0000_0000_0000_0000_0010	
        int shiftRight = a >> 1;
		
		// 0000_1000 : 8
		// 1111_0111
		//        +1
		// 1111_1000 : -8
		// 8 : 0b0000_0000_0000_0000_0000_0000_0000_1000
		//   : 0b1111_1111_1111_1111_1111_1111_1111_0111
		//              +1
		// -8: 0b1111_1111_1111_1111_1111_1111_1111_1000   
		// unsignedShift  : 0b0111_1111_1111_1111_1111_1111_1111_1100
        int unsignedShift = -8 >>> 1;
        System.out.println("shift: << = " + shiftLeft + ""
        		+ ", >> = " + shiftRight + ", >>> = " + unsignedShift);
        return;
	}
}
