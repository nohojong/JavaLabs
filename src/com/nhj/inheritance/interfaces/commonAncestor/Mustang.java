package com.nhj.inheritance.interfaces.commonAncestor;

public class Mustang extends Horse implements Mammal {
	
	
    public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself());
    }
}