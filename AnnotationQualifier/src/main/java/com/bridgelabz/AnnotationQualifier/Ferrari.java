package com.bridgelabz.AnnotationQualifier;

import org.springframework.stereotype.Component;

@Component("ferrari")
public class Ferrari implements Car {

	public void getCarName() {

		System.out.println("This is FERRARI!!!");

	}

}
