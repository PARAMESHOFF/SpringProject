package com.kodnest.Springproject1;

import org.springframework.stereotype.Component;

@Component("mob")
public class Mobile implements Electornics{
	public void useDevice() {
		System.out.println("Mobile is Getting used");
	}
}
