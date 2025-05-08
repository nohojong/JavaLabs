package com.nhj.generics.typeInference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxDemo {
	static {
		// Map<K, V>
		Map<String, List<String>> myMap = 
				//HashMap<K,V>
				new HashMap<String, List<String>>();
	}

	public static <U> void addBox(U u, List<Box<U>> boxes) {
		Box<U> box = new Box<>();
		box.set(u);
		boxes.add(box);
	}

	public static <U> void outputBoxes(List<Box<U>> boxes) {
	    int counter = 0;
	    for (Box<U> box: boxes) {
	      U boxContents = box.get();
	      System.out.println("Box #" + counter + " contains [" +
	             boxContents.toString() + "]");
	      counter++;
	    }
	}

	public static void main(String[] args) {
		//ArrayList엘리먼트는 <Box<Integer>>...
		//ArrayListdml 타입 파라미터의 아규먼트는,
		// 파라미터화 된 타입인 <Box<Integer>> 을 저장함
		ArrayList<Box<Integer>> listOfIntegerBoxes =
		  new ArrayList<>();
		
		BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		BoxDemo.outputBoxes(listOfIntegerBoxes);
	 }
}