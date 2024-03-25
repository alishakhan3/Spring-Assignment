package com.springcore.question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new  AnnotationConfigApplicationContext(SpringJavaConfig.class);
    	Triangle t=(Triangle) context.getBean("tr");
    	
        System.out.println(t);
    }
}
