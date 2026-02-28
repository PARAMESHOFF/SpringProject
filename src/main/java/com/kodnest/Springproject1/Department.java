package com.kodnest.Springproject1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	int depId;
	String depName;
	
	void depDetails() {
		System.out.println("Department Id: " + depId);
		System.out.println("DepartmentName: " + depName);
	}

	public Department(@Value("${department.depid}") int depId, @Value("${department.depname}") String depName) {
		
		this.depId = depId;
		this.depName = depName;
	}
	
	
}
