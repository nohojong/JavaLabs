package com.nhj.generics;

	public class Box<T> {
	
	    private T t;          
	
	    public void set(T t) {
	        this.t = t;
	    }
	
	    public T get() {
	        return t;
	    }
	
	    public <U extends Number> void inspect(U u){
	        System.out.println("T: " + t.getClass().getName());
	        System.out.println("U: " + u.getClass().getName());
	}
	
	public static void main(String[] args) {
	    Box<Integer> integerBox = new Box<Integer>();
	    
	    integerBox.set(new Integer(10));
	    // 타입 파라미터 상한 제한으로 컴파일 타임때 강력한 타입검사를 실시한 결과!!!
	    integerBox.inspect(/*"some text"*/Integer.valueOf(1)); // 에러: 여전히 String입니다!
	    }
	}
// T 를 타입 파라미터라고함
//public class Box <T> {
// 
//	private T object; // object를 타입 변수
//
//    public void set(T object) { this.object = object; }
//    public T get() { return object; }
//    
//    public static <K extends Number> byte hello(K k) {
//    	return k.byteValue();
//    }
//}
