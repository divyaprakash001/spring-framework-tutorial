package com.divyaspring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divyaspring.orm.dao.StudentDao;
import com.divyaspring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 for adding new student");
			System.out.println("PRESS 2 for displaying all student");
			System.out.println("PRESS 3 for getting detail of single student");
			System.out.println("PRESS 4 for deleting student");
			System.out.println("PRESS 5 for updating student");
			System.out.println("PRESS 6 for exit");

			try {

				System.out.print("Enter your option :: ");
				int option = Integer.parseInt(br.readLine());
				int id;
				String name, city;
				Student student = null;

				switch (option) {
				case 1: // adding new student
					System.out.println("Enter student id :: ");
					id = Integer.parseInt(br.readLine());
					System.out.print("Enter student name :: ");
					name = br.readLine();
					System.out.print("Enter student city :: ");
					city = br.readLine();

					student = new Student(id, name, city);
					int r = studentDao.insert(student);
					System.out.println("One student data inserted with id :: " + r);
					System.out.println("-----------------------------\n");

					break;
				case 2: // display all student
					List<Student> students = studentDao.getAllStudents();
					System.out.println("STUDENTID  STUDENTNAME  STUDENTCITY");
					for (Student studentt : students) {
						System.out.println(studentt.getStudentId() + "\t" + studentt.getStudentName() + "\t"
								+ studentt.getStudentCity());
					}
					System.out.println("----------------------------\n");
					break;
				case 3: // display one student
					System.out.println("Enter student id to search :: ");
					id = Integer.parseInt(br.readLine());
					student = studentDao.getStudent(id);
					System.out.println("STUDENTID  STUDENTNAME  STUDENTCITY");
					System.out.println(
							student.getStudentId() + "\t" + student.getStudentName() + "\t" + student.getStudentCity());
					System.out.println("----------------------------\n");
					break;
				case 4: // delete the student
					System.out.println("Enter student id to delete :: ");
					id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("Student deleted with the id :: " + id);
					System.out.println("----------------------------\n");
					break;
				case 5: // update the student
					System.out.println("Enter student id to search and update :: ");
					id = Integer.parseInt(br.readLine());

					student = studentDao.getStudent(id);
					if (student != null) {
						System.out.print("Enter new name [Old name :: " + student.getStudentName() + "] :: ");
						String newName = br.readLine();
						System.out.print("\nEnter new city [Old city :: " + student.getStudentCity() + "]:: ");
						String newCity = br.readLine();

						student.setStudentName(newName);
						student.setStudentCity(newCity);
						studentDao.updateStudent(student);
						System.out.println("student data updated successfully with the id ::" + id);
					} else {
						System.out.println("student not available with the id :: " + id);
					}

					break;
				case 6: // exit
					System.out.println("Thanks for using my application");
					go = false;
					break;
				default:
					System.out.println("Please choose the correct option");
					System.out.println("--------------------------------");
					break;
				}

			} catch (Exception e) {
				System.out.println("invalid input Try with another one");
				e.getMessage();
			}

		}

	}
}
