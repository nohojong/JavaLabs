package com.nhj.variables;

public class Car {
	
	private int kind;
	private int vendor;
	private int model;
	private int price;
	// 멤버로 Car클래스 객체를 참조 변수를 선언
	private static Car instance= null;
	
	// private 컨스트럭터를 정의
	private Car() {	}
	
	// Singleton design pattern을 구현
	public static Car createInstance() {
		
		if (instance ==null) { // 조건문 (instance == null) 연산 결과가 true 이면,
							   // 다음 코드 (instance = new Car();)를 실행함
			instance = new Car();// Car 클래스 객체를 만들 수 있는 유일한 곳!!!
		}
		return instance;
	}
	public Car(int kind) {
        this.kind = kind;
	}
	
	public Car(int kind, int vendor) {
		this(kind);
		this.vendor = vendor;
	}
	public Car(int kind,int vendor,int model) {
		this(kind , vendor);
		this.model = model;
	}
	public Car(int kind,int vendor,int model,int price) {
		this(kind, vendor, model);
		this.price = price;
	}
	// static 메서드는 클래스의 인스턴스 메서드(클래스 객체의 메서드)를 호출할 수 없음.
	public static void iamStaticMethod() {
//		getkind();
		System.out.println("Hey, There");
	}
	// 하지만 클래스의 인스턴스 메서드에서는 static 메서드를 호출할수 있음.
	public int getKind() {
		Car.iamStaticMethod();
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public int getVendor() {
		return vendor;
	}

	public void setVendor(int vendor) {
		this.vendor = vendor;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
