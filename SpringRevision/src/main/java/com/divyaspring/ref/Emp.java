package com.divyaspring.ref;

public class Emp {
	private String empId;
	private Address empAddress;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empAddress=" + empAddress + "]";
	}

}
