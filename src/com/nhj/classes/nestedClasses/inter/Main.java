package com.nhj.classes.nestedClasses.inter;

public class Main {
	public static void GoodByeInterface(GoodBye goodBye){
		goodBye.goodBye("노", "호종");
	}

	public static void main(String[] args) {

		GoodBye goodBye1 = new HelloWorld();
			
		GoodByeInterface(goodBye1);
		}
		
	}