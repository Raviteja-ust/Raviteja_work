package com.ust.FirstMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.FirstMaven.Network.Airtel;
import com.ust.FirstMaven.Network.Jio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	//Airtel bean = (Airtel)context.getBean("airtel");
    	Jio bean = (Jio)context.getBean("jio");
    	bean.calling();
    	bean.data();
       // System.out.println( "Hello World!" );
    }
}
