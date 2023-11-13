package com.divyaspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspring\\config.xml");
		Student student1 = context.getBean("student1", Student.class);
		System.out.println(student1);

//		another way using BeanFactory interface
//		Resource resource = new ClassPathResource("com\\\\divyaspring\\\\config.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);  
//		Student student2 =   factory.getBean("student1",Student.class);
//		System.out.println(student2);

		Student student3 = context.getBean("student3", Student.class);
		System.out.println(student3);

	}
}
