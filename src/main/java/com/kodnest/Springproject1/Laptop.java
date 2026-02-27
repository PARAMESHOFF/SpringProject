package com.kodnest.Springproject1;

import org.springframework.stereotype.Component;

@Component("lap")

public class Laptop implements Electornics{
	public void useDevice() {
		System.out.println("Laptop is getting used");
	}
}
