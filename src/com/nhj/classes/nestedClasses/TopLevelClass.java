package com.nhj.classes.nestedClasses;

public class TopLevelClass {
	
	void accessMembers(DefiningInnerAndStaticClassOuterClass outer) {     
        // Compiler error: Cannot make a static reference to the non-static
        //     field OuterClass.outerField
		// 다음 코드는 outerField 를 static 처럼 사용하는 컴파일 에러
		// outerField는 DefiningInnerAndStaticClassOuterClass 클래스의 인스턴스 필드.
        // System.out.println(OuterClass.outerField);
		
        System.out.println(outer.outerField);
        System.out.println(DefiningInnerAndStaticClassOuterClass.staticOuterField);
    }  

}