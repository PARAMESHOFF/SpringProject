package com.kodnest.Springproject1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
	
	Electornics ref;
	
	public Student1(@Qualifier("mob") Electornics ref) {
		super();
		this.ref = ref;
	}

	void study() {
		System.out.println("Student is Studing");
	}
	
	void deviceUse() {
		ref.useDevice();
	}
}
