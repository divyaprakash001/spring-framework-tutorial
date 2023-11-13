package com.divyaspring.lifecycle.springInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Emp implements InitializingBean, DisposableBean {
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

	public void destroy() throws Exception {
		System.out.println("Destroy method this is");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method this is");

	}

}
