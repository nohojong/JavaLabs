package com.nhj.inheritance.protecteds;

public class OtherClass {

	private ProtectedClass pc;
	
	public OtherClass() {
		pc= new ProtectedClass();
	}
	
	public void useHelloWorldMEthodOfProtectedClass() {
		pc.helloWorld(); // protected
	}
	public void useGoodByeMEthodOfProtectedClass() {
		pc.goodBye(); // public
	}
	
}
