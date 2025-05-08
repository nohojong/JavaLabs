package com.nhj.variables;

// Access Modifier level
// - class level : public, default[package-private(비공개)(패키지 밖에서는 비공개:패키지 내에서만 공개(엑세스)]
// - member level : public, pricat, protected, default
public class Bicycle { //<---class level
	
	
	// 내부에서 적용되고 있는 access modifier level은 property[field, method, 생성자] level임
	private int cadence = 1;
	private int gear = 1;
	private int GEAR = 1;
	private int helloWorld=0; //카멜(낙타) 케이스 단어가 달라질때 대문자 사용
	
	// 다음의 클래스 변수(static필드)는
	// Bicycle 클래스 객체의 인스턴스 들에게 공유됨
	private static int numberOfBicycle = 0;
	
	public Bicycle() {}

	public Bicycle(int cadence) {
		this.cadence = cadence;
	}
	public Bicycle(int cadence,int gear) {
//		super();// 부모(super) 클래스(Object 클래스)의 컨스트럭터를 호출함.
		this.cadence = cadence;
		this.gear = gear;
	}
	
	public int getCadence() {
		return cadence;
	}
	
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public Bicycle seeWhosFastest() {
		Bicycle fastest;
		
		Number number;
		
		fastest = new Bicycle();
		
		// 이전까지 수없 내용들은 기본 데이터 타입의 리턴값을 리턴했는데
		// 이번에는 참조값을 리턴한다
		return fastest;
	}
}

// Motor 클래스 자신이 정의한 멤버(필드, 컨스트럭터, 메서드) 가 없지만,
// 자바의 Root 클래스인 object 를 상속하였음
// access modifier를 default로 설정


		
	
