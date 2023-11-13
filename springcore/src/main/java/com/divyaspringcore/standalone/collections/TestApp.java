package com.divyaspringcore.standalone.collections;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspringcore\\standalone\\collections\\standaloneCollectionConfig.xml");
		Person person = context.getBean("person3", Person.class);
		System.out.println(person.getFriends());
		System.out.println(person.getFriends().getClass().getName());
		
		System.out.println("-----------------------------------------------");
		
		System.out.println(person.getFoodItems());
		System.out.println(person.getFoodItems().getClass().getName());
		
		System.out.println("-----------------------------------------------");
		
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());

	}

}
