package com.nhj.classes.nestedClasses.interfaces;

public class AnimalMain {		

	public static void main(String[] args) {

		Animal animal = new Animal() {

			@Override
			public void sound() {
				System.out.println("멍");
			}

			@Override
			public void move() {
				System.out.println("칵");
			}
		};
		animal.sound();
		animal.move();
	}
}		
			
		
			
		
			
		