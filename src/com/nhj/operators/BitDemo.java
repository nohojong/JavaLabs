package com.nhj.operators;

class BitDemo {
	
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        
        
        // val & bitmask : & -> bitwise and 연산
        // bitwise and 연산을 수행될때,
        // 왼졲, 오른쪽 두 피연산자의 동일한 비트 위치에 있는 두 비트별로 and 연산을 함.
        // bitwise and 연산을 수행할 때 이진수 1은true, 0은false 라고 생각하면 됌.
        // bitmask : 0x000F --> 0b0000_0000_0000_1111
        // val :     0x2222 --> 0b0010_0010_0010_0010
        //            0b0000_0000_0000_0010 --> 십진수 2
        
        int ret = val & bitmask;
        
        return;
        // prints "2"
        //System.out.println(val & bitmask);
    }
}