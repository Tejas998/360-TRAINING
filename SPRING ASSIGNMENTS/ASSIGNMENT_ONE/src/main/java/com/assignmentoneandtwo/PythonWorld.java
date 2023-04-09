package com.assignmentoneandtwo;

public class PythonWorld implements PythonLanguage{
	
	private JavaLanguage javaLanguage;
    
    public PythonWorld(JavaLanguage javaLanguage) {
        this.javaLanguage = javaLanguage;
    }

	public void learningPython() {
		System.out.println("I am Learning Pyhton");
	}


}
