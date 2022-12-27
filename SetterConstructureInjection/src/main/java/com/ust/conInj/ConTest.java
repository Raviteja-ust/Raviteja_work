package com.ust.conInj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConTest {

	public static void main(String[] args) {

//load the spring Configuration file
//ClassPathXmlApplicationContext context=
//new ClassPathXmlApplicationContext("applicationContext.xml");

//retrieve bean from spring container
//CricketTeam theTeam=context.getBean("cricketTeam",CricketTeam.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ust.conInj");
		context.refresh();

		CricketTeam theTeam = context.getBean("cricketTeam", CricketTeam.class);

		// call the method on bean
		System.out.println(theTeam.getInstruction());

		context.close();

	}
}
