package com.divyaspringcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		System.out.println("Student.getStudentId()");
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Student.setStudentId()");
		this.studentId = studentId;
	}

	public String getStudentName() {
		System.out.println("Student.getStudentName()");
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Student.setStudentName()");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		System.out.println("Student.getStudentAddress()");
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Student.setStudentAddress()");
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
