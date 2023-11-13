package com.divyaspringcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public Example() {
		super();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

//	life cycle method using annotation

	@PostConstruct
	public void suru() {
		System.out.println("suru ho jao");
	}

	@PreDestroy
	public void samapt() {
		System.out.println("samapt ho gya hai");
	}

}
