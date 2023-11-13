package com.divyaspring.lifecycle;

public class Emp {
	private String empId;
	private Address empAddress;

	public Emp() {
		super();
	}

	public Emp(String empId, Address empAddress) {
		this.empId = empId;
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empAddress=" + empAddress + "]";
	}

	
	public void suru() {
		System.out.println("This is init method");
	}

	public void khatam() {
		System.out.println("This is destroy method");
	}

}
