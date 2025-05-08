package com.nhj.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class WildcardErrorBad {

    public void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
    	Number temp = l1.get(0); // l1.get(0)이 리턴하는 것이
    							 // capture#1-of ? extends Number
    	// The method set(int, capture#2-of ? extends Number)
    	// in the type List<capture#2-of ? extends Number>
    	// is not applicable for the arguments (int, capture#3-of ? extends Number)
    	//l1.set(0, l2.get(0)); 	
    	// The method set(int, capture#4-of ? extends Number)
    	// in the type List<capture#4-of ? extends Number>
    	// is not applicable for the arguments (int, Number)
    	//l2.set(0, temp);	    
    }
    public static void main(String...args) {
    	List<Integer> li = Arrays.asList(1, 2, 3);
    	List<Double>  ld = Arrays.asList(10.10, 20.20, 30.30);
    	WildcardErrorBad w = new WildcardErrorBad();
    	w.swapFirst(li, ld);
    	
    }
    String[] sts = new String[10];{
    for ( String elem : sts) {
    	elem.toString();
    }
    }
}
