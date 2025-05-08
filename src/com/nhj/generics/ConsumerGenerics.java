package com.nhj.generics;

import java.util.function.Consumer;

public class ConsumerGenerics<T> implements Consumer<T> {

	 private T t;          
		
	 public ConsumerGenerics(T t) {
		 this.t=t;
	 }
	 
    public void set(T t) {
        this.t = t;
    }
	
    public T get() {
        return t;
    }
	
	@Override
	public void accept(T t) {
		System.out.println(t);
	}

	public static void main(String ...args) {
		ConsumerGenerics<Integer> cg = new ConsumerGenerics<>(0);
		cg.accept(10);
	}
	
}

