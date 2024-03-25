package com.springcore.question3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringJavaConfig {
	
	@Bean
	public Triangle tr() {
		return new Triangle("Equilateral", 5, 5, 5);
	}
}
