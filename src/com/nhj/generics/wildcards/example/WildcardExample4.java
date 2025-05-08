package com.nhj.generics.wildcards.example;

import java.util.List;

public class WildcardExample4 {

	// 절대 unbounded Wildcard 배열을 쓰지 마세요!!!
	
    public static List<?>[] getWildcardArray() {
        List<?>[] arr = new List<?>[2];
        arr[0] = List.of("One", "Two");
        arr[1] = List.of(1, 2, 3);
        return arr;
    }

    public static void main(String[] args) {
        for (List<?> l : getWildcardArray()) {
            System.out.println(l);
        }
    }
}