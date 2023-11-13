package com.divyaspringcore.autowire.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//use @Autowired at one of three places => property, constructor, setter

public class Emp {
	@Autowired
	@Qualifier("temp2")
	private Address address;

	public Emp() {
		super();
	}

	public Emp(Address address) {
		System.out.println("inside cons");
		
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting values");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
