package com.divyaspringcore.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspringcore\\autowire\\autowireConfig.xml");
		Emp emp1 =  context.getBean("emp1",Emp.class);
		System.out.println(emp1);

	}

}
