package com.kodnest.Springproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springproject1Application {

	public static void main(String[] args) {
	ApplicationContext ac = SpringApplication.run(Springproject1Application.class, args);
//	
//	Student st =  ac.getBean(Student.class);
//	
//	System.out.println(st.getRollno());
//	System.out.println(st.getName());
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContex.xml");
		
//		Student1 s = (Student1) ac.getBean("student1");
//		
//		s.study();
//		s.deviceUse();
	
	
	Employee employee = ac.getBean(Employee.class);
	
	employee.work();
	employee.empDetails();
	
	
		
	}
}
