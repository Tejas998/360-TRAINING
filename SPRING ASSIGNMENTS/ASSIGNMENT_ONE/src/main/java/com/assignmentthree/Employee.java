package com.assignmentthree;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee_details")
public class Employee {
	
	@Value("Consult Add Emp 1")
	private String empName; 
	@Value("USA")
	private String empCountry;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCountry() {
		return empCountry;
	}
	
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	
	@Override
	public String toString() {
		return "[Employe Name=" + empName + ", Country=" + empCountry + "]";
	}
	
}
