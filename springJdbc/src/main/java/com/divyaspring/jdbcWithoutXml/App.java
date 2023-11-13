package com.divyaspring.jdbcWithoutXml;

import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.divyaspring.jdbc.dao.StudentDaoImpl;
import com.divyaspring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) throws IOException {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		StudentDaoImpl dao = context.getBean("studentDao", StudentDaoImpl.class);

		Student student = new Student();
		student.setId(18);
		student.setName("dhoni");
		student.setCity("csk");
		System.out.println( "no of record inserted :: "+dao.insert(student));

//		Student student2 = new Student();
//		student2.setName("Divya Prakash");
//		student2.setCity("Arrah");
//		student2.setId(222);
//		
//		System.out.println("record updated : " + dao.change(student2));

//		System.out.println("record deleted :: " + dao.delete(13));

		student = dao.getStudent(12);
//
		System.out.println(student);

		List<Student> students = dao.getAllStudents();
		System.out.println("ID\tNAME\tCITY");
		System.out.println("--------------------");
		for (Student student2 : students) {
			System.out.println(student2.getId() + " \t" + student2.getName() + "\t" + student2.getCity());
		}

	}
}
