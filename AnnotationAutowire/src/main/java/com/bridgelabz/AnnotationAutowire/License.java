package com.bridgelabz.AnnotationAutowire;

import org.springframework.stereotype.Component;

@Component
public class License {

	String number = "AB1736BHSW4675";

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "License [number=" + number + "]";
	}

}
