package com.bridgelabz.AnnotationQualifier;

import org.springframework.stereotype.Component;

@Component("mustang")
public class Mustang implements Car {

	public void getCarName() {
		System.out.println("This is MUSTANG!!!");
	}

}
