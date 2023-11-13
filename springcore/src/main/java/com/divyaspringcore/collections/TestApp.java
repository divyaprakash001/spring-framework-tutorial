package com.divyaspringcore.collections;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/divyaspringcore/collections/collectionConfig.xml");
		Emp emp = (Emp) context.getBean("emp1");

		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddresses());
		System.out.println("------------Phones-------------------");
		for (String phones : emp.getPhones()) {
			System.out.println(phones);
		}
		System.out.println("------------Addresses-------------------");
		for (String addresses : emp.getAddresses()) {
			System.out.println(addresses);
		}
		System.out.println("-------------------------------");
		System.out.println("Course\t\tDuration");
		System.out.println("------\t\t---------");
		for (Map.Entry<String, String> entry : emp.getCourse().entrySet())
			System.out.println(entry.getKey() + "\t\t" + entry.getValue());
		
		System.out.println("-------------conn------------------");
		System.out.println(emp.getProps());
		
		
		System.out.println(emp.getPhones().getClass().getName());

	}

}
