package com.nhj.inheritance;

import com.nhj.inheritance.SubClass2.SubNestedClass;
import com.nhj.inheritance.SuperClass2.NestedClass;

public class Main {

	public static void main(String[] args) {
		
		SuperClass2 sp2 = new SuperClass2();
		// SuperClass2 멤버인 class NestedClass가 안보임
				
		SubClass2 sc = new SubClass2();
		System.out.printf("getPrivateField:%d \n", sc.getPrivateField());
		System.out.printf("getSuperPrivateField:%d \n", sc.getSuperPrivateField());

		NestedClass nc = sc.new NestedClass();
		nc.accessPrivateField();
		
		SubNestedClass snc = sc.new SubNestedClass();
		snc.accessSuperPrivateField();
	}
}


