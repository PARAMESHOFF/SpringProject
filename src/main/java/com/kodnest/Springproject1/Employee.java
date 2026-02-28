package com.kodnest.Springproject1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	int empid;
	String empName;
	double empSalary;
	Department dept;
	
	
	void work() {
		System.out.println("Employee is working");
	}
	
	void empDetails() {
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		dept.depDetails();
	}

	public Employee(@Value("${employee.empid}") int empid, @Value("${employee.empName}") String empName, @Value("${employee.empSalary}")double empSalary, Department dept) {
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dept = dept;
	}
	
}
