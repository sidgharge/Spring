package com.bridgelabz.AnnotationQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bond")
public class Bond {

	@Autowired
	@Qualifier("mustang")
	Car car;
	
	public void showCar(){
		car.getCarName();
	}
}
