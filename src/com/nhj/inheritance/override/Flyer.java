package com.nhj.inheritance.override;

public interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}