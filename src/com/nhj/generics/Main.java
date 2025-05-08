package com.nhj.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	static {
//		List list = new ArrayList();// 자바에서 이렇게 사용하지마라: raw 타입
//		list.add("Hello");
//		Integer s = (Integer)list.get(0);// Type mismatch: 
//								// cannot convert from String to Integer
		
		//public interface List<E> extends Collection<E>
		List<String> list =new ArrayList<String>();
		list.add("Hello");
		String intV = list.get(0);
	}
	
	public static void getObjectOfBox(Box box) {
		String str = (String)box.get();
		
	}
	public static void setObjectOfBox(Box box) {
		
		Double doubleV= 10.0d;
		//Integer intV=10;
		box.set(doubleV);
	}
	
	public static void main(String[] args) {
		// 다음 스테이트먼트의 <> 안에 정의된 Integer를 타입 아규먼트라 한다
		// 제너릭 클래스 인스턴스를 생성(new 연산자) 할 때 타입 아규먼트를 지정
		// 텅빈 꺽쇠(타입 아규먼트를 지정하지 않은)를 일명 다이아몬드라고 한다 <>
		// 타입 아규먼트 추론(Inference)
		Box<String> box = new Box</*Integer*/>();
		getObjectOfBox(box);
		setObjectOfBox(box);
		
		Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<>("hello", "world");
		
		Pair<String, Double> pairs = new OrderedPair<>("",3.14d);
		
		Pair<Box<String>,String> pair1 = new OrderedPair<>(box,"");
	}

}
