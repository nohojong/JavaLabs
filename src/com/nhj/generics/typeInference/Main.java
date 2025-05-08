package com.nhj.generics.typeInference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	 static <T> T pick(T a1, T a2) { return a2; }
	 
	 public static void main(String ...args) {
		 
	 //pick을 호출하는시점에
     // 컴파일러가 타입 파라미터 아규먼트 추론을 시작합니다.
     // : 타입 아규먼트 지정을[Main.<Serializable>pick()] 생략했기 때문에 
     Serializable s = pick("d", new ArrayList<String>());
     
     List<String> list = new ArrayList<>();
	     list.add("korea");
	     list.add("usa");
	     list.add("england");
	     list.add("japan");
	     String[] strs = new String[list.size()];
	     list.toArray(strs);
	     // <T> T[] toArray(T[] a);
	     // list.<String>toArray(strs);
     
	 }
}
