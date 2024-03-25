package com.springcore.question4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages="com.springcore.question4")
@EnableAspectJAutoProxy
public class SpringJavaConfig {
	
	@Bean
	public Triangle tr() {
		return new Triangle("Equilateral", 5, 5, 5);
	}
	
	@Bean
	public aspectLog al() {
		return new aspectLog();
	}
}