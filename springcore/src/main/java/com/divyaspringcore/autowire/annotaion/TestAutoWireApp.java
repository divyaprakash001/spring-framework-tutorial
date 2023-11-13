package com.divyaspringcore.autowire.annotaion;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspringcore\\autowire\\annotaion\\autowireConfig.xml");
		Emp emp1 =  context.getBean("emp1",Emp.class);
		System.out.println(emp1);

	}

}
