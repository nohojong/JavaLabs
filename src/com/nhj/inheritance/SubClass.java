package com.nhj.inheritance;

public class SubClass extends SuperClass {
    public void useInner() {
        Inner inner = new Inner();
        inner.showSecret();  // ✅ 간접 접근
        
    }
}