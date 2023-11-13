package com.divyaspringcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com\\divyaspringcore\\lifecycle\\lifecycleConfig.xml");
//		Samosa samosa = (Samosa) context.getBean("samosa");
//		System.out.println(samosa);
//
		context.registerShutdownHook();
//
//		System.out.println("------------------------");
//
//		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
//		System.out.println(pepsi);

		Example example = (Example) context.getBean("example");
		System.out.println(example);

	}

}
