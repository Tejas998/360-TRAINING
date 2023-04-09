package com.assignmentoneandtwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		  ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		  
		  JavaWorld javaWorld = (JavaWorld) context.getBean("Framework");
		  javaWorld.learningJava();
		  
		  PythonLanguage pythonLanguage = (PythonLanguage) context.getBean("pythonFramework");
		  pythonLanguage.learningPython();
	}

}
