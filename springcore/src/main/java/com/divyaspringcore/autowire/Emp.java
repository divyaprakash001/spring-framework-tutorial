package com.divyaspringcore.autowire;

public class Emp {
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
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
