package com.divyaspringcore.stereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("Divya Prakash")
	private String studentName;

	@Value("Arrah")
	private String city;

//	@Value("#{10+14}")
	@Value("#{8>6?24:23}")
	private int age;

	@Value("#{temp}")
	private List<String> addresses;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", age=" + age + ", addresses=" + addresses
				+ "]";
	}

}
