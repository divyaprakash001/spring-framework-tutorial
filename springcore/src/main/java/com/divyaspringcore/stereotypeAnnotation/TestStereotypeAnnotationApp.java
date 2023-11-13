package com.divyaspringcore.stereotypeAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotypeAnnotationApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com\\divyaspringcore\\stereotypeAnnotation\\stereotypeAnnotaionConfig.xml");
		Student student = context.getBean("ob", Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddresses().getClass().getName());
		System.out.println(student);
		System.out.println(student.hashCode());

		Student student2 = context.getBean("ob", Student.class);
		System.out.println(student2.hashCode());

		Student student3 = context.getBean("ob", Student.class);
		System.out.println(student3.hashCode());
		
		System.out.println("-------------------------------------");
		
		Teacher teacher1 = context.getBean("teacher1", Teacher.class);
		System.out.println(teacher1.hashCode());

		Teacher teacher2 = context.getBean("teacher1", Teacher.class);
		System.out.println(teacher2.hashCode());

	}
}
