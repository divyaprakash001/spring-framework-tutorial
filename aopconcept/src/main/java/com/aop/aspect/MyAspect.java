package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {

//	@Before("execution(* com.aop.services.PaymentServiceImpl.*)")  // for all methods
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("payment started");
	}
	
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("payment done");
	}
	
}

