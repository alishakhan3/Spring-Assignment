package com.springcore.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
        		new ClassPathXmlApplicationContext("config.xml"); 
    	
    	company e=context.getBean(company.class);

        e.display();
    }
}
