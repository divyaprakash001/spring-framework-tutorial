package com.divyaspringcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/divyaspringcore/ref/refConfig.xml");
		A a = (A) context.getBean("aaref");
		B b = (B) context.getBean("bref");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());

	}

}
