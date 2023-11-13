package com.divyaspring.lifecycle.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspring\\lifecycle\\annotation\\AnnotationlifeConfig.xml");
		Emp emp = context.getBean("emp5",Emp.class);
		System.out.println(emp);
		
		context.registerShutdownHook();

	}
}
