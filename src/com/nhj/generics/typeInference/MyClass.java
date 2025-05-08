package com.nhj.generics.typeInference;

class MyClass<X> {

	  private X x;
	  
	  <T> MyClass(T t) {
	    // ...
	  }
	  public static void main(String ...args) {
		  MyClass<Integer> mc = new MyClass<>("Hello");
		  
		  
	  }
}