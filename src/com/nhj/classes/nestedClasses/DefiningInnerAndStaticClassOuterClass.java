package com.nhj.classes.nestedClasses;

public class DefiningInnerAndStaticClassOuterClass {
	
	/*private*/ String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    // StaticNestedClass 객체 참조 변수
    // static nested class 인 StaticNestedClass 클래스 객체의 인스턴스 참조 변수
    StaticNestedClass staticNestedInstance;

    public DefiningInnerAndStaticClassOuterClass() {
        // StaticNestedClass 인스턴스를 생성하여 필드에 저장
        staticNestedInstance = new StaticNestedClass();
    }

    class InnerClass {
        void accessMembers() {
        	// InnerClass 의 인스턴스 메서드는 다음과 같이
        	// Outer class 의 인스턴스 필드와 static 필드를 엑세스 할 수있음.
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        // 외부 클래스의 필드는 오직 외부 클래스 객체 참조를 통해서만 사용할 수 있습니다
        void accessMembers(DefiningInnerAndStaticClassOuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            // field outerField
        	// Outer class 의 인스턴스 필드를 액세스할수없음.
            // System.out.println(outerField);
        	// 이것이 왜 가능할까???
            System.out.println(outer.outerField);
            
            // 단 , Outer class 의 static field 는 액세스 할수 있다.
            System.out.println(staticOuterField);
        }
    }

    // StaticNestedClass의 메서드를 호출하는 메서드
    public void callStaticNestedMethod() {
        staticNestedInstance.accessMembers(this);
    }
}
