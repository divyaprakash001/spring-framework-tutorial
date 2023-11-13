package com.divyaspringcore.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestConfigApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		Student student = context.getBean("demo", Student.class);
		System.out.println(student);
		student.study();
		

	}

}
