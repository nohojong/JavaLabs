package com.nhj.inheritance.polymorphisme.quivalency.clone;

public class Person implements Cloneable  {
	
	private Address address;
	
	public Person() {}
	
	public Person(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	

}