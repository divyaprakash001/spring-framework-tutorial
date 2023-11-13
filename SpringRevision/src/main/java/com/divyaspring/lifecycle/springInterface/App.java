package com.divyaspring.lifecycle.springInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspring\\lifecycle\\springInterface\\InterfacelifeConfig.xml");
		Emp emp = context.getBean("emp5",Emp.class);
		System.out.println(emp);
		
		context.registerShutdownHook();

	}
}
