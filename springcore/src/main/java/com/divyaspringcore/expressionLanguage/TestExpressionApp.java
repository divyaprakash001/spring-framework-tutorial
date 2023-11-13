package com.divyaspringcore.expressionLanguage;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestExpressionApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\divyaspringcore\\expressionLanguage\\expressionConfig.xml");
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);
		
//		 SpelExpressionParser temp  =new  SpelExpressionParser();
//		org.springframework.expression.Expression expression =  temp.parseExpression("22+4+43+24");
//		 System.out.println(expression.getValue());
		

	}
}
