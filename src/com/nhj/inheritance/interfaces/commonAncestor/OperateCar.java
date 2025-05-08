package com.nhj.inheritance.interfaces.commonAncestor;

public interface OperateCar {
	default public int startEngine() {
        // Implementation
    	return 0;
    }
}