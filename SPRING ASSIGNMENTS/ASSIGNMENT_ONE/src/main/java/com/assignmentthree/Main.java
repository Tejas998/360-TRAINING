package com.assignmentthree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ComponentApplicationConfig.xml");
		Employee employee = (Employee)context.getBean("employee_details");
		System.out.println(employee);
		
	}

}
