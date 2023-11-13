package com.divyaspring.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Emp  {
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

	
	@PreDestroy
	public void khtm() throws Exception {
		System.out.println("Destroy method this is");

	}

	@PostConstruct
	public void suru() throws Exception {
		System.out.println("init method this is");

	}

}
