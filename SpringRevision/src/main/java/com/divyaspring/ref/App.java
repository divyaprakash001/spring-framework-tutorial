package com.divyaspring.ref;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspring\\ref\\refConfig.xml");
		Emp emp = context.getBean("emp2",Emp.class);
		System.out.println(emp);

	}
}
