package com.ust.ConstructureInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class ConApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ust.ConstructureInjection");
		context.refresh();
		Employee empBean = (Employee) context.getBean("employee2");
		empBean.display();

	}
}
