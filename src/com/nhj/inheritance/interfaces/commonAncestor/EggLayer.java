package com.nhj.inheritance.interfaces.commonAncestor;

public interface EggLayer extends Animal {
	
	
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}