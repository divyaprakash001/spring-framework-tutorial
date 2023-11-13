package com.divyaspringcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> syllabus;

	public Person(String name, int personId, Certi certi, List<String> syllabus) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.syllabus = syllabus;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + " { " + this.certi.name + " }"  + this.syllabus ;
	}

}
