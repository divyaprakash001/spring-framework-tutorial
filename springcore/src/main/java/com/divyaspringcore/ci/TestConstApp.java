package com.divyaspringcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspringcore\\ci\\ciConfig.xml");
		
		Person person1 = (Person) context.getBean("person1");
		
		System.out.println(person1);
		
		System.out.println("--------------------------------");
		
		Addition ad =  (Addition)context.getBean("add");
		ad.doSum();
		

	}

}
