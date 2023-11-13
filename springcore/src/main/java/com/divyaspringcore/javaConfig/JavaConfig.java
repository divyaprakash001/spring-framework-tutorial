package com.divyaspringcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.divyaspringcore.javaConfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa = new  Samosa();
		return samosa;
	}

	@Bean(name = {"student","temp","demo"})
	public Student getStudent() {
//		creating new Student object
		Student student = new Student(getSamosa());
		return student;
	}
	
}
