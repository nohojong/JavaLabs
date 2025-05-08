package com.nhj.inheritance.interfaces.commonAncestor;

public interface FlyCar {
    // ...
    default public int startEngine() {
        // Implementation
    	return 0;
    }
}