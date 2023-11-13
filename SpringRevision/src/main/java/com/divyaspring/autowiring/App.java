package com.divyaspring.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspring\\autowiring\\autowiringConfig.xml");
		Student student1 = context.getBean("student1", Student.class);
		System.out.println(student1);



	}
}
