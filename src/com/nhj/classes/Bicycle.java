package com.nhj.classes;

// 암시적으로 Object 클래스를 상속...extends 보이지 않지만,
// 디폴트로 object 클래스 를 상속함
// : 암시적[implicit]으로 Object 라는 슈퍼 클래스
public class Bicycle {
    
    // 자전거 클래스는 세 개의 필드를 가집니다.
    public int cadence;
    public int gear;
    public int speed;
    
    // 다음의 클래스 변수(static필드)는
 	// Bicycle 클래스 객체의 인스턴스 들에게 공유됨
    private static int numberOfBicycle = 0;
    //default constructor 가 없는 것이
    // Bicycle 클래스를 상속한 클래스에게 문제가 될 수 있음.
    public Bicycle() {}
    
    public Bicycle(int cadence) {
    	this.cadence=cadence;
    }
    public Bicycle(int cadence,int gear) {
    	this(cadence);
    	this.gear=gear;
    }
    public Bicycle(int cadence,int gear,int speed) {
    	this(cadence,gear);
    	this.speed=speed;
    }
  
    
        
    // 자전거 클래스는 하나의 생성자를 가집니다.
//    public Bicycle(int startCadence, int startSpeed, int startGear) {
//        gear = startGear;
//        cadence = startCadence;
//        speed = startSpeed;
//    }
        
    // 자전거 클래스는 네 개의 메서드를 가집니다.
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}


