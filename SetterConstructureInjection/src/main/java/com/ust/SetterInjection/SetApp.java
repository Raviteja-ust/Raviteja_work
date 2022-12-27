package com.ust.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class SetApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ust.SetterInjection");
		context.refresh();
		Employee empBean = (Employee) context.getBean("employee1");
		empBean.display();

	}
}
