package com.nhj.variables;

public class Dog {
	
	
	private int name;
	private int gender;
	private int age;
	
	public Dog(){
	}
	// 디폴트 컨스트럭터를 구현하세요
	public Dog(int name) {
        this.name = name;
	}
	// 파라미터가 하나인 컨스트럭트를 구현하세요.
	public Dog(int name,int gender) {
        this(name);
        this.gender = gender;
	} 
	// 파라미터가 두개인 컨스트럭터를 구현하세요.
	public Dog(int name,int gender,int age) {
		this(name,gender);
        this.age = age;
	} 
	// 파라미터가 세개인 컨스트럭터를 구현하세요.
	
	// **참고사항 : this 키워드를 사용하시면 더욱 좋습니다
	//            그리고 새롭개 추가된 필드들(gender,age)를 위한 getter/setter 메서드도 추가해주세요.
	public int getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(int name) {
		this.name = name;
	}
	

}
