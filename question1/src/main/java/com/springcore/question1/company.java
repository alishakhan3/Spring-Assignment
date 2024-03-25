package com.springcore.question1;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class company {
	
	private Map<String, String> employees;
	
	@Autowired
	public company(Map<String, String> employees) {
		this.employees = employees;
	}

	public company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Map<String, String> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<String, String> employees) {
		this.employees = employees;
	}

	public void display() {
		for(Map.Entry<String, String> entry: employees.entrySet()) {
			System.out.println("Employee ID: "+entry.getKey()+"\nName: "+entry.getValue()+"\n");
		}
	}
	
}
