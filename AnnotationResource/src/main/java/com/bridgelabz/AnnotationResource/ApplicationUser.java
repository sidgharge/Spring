package com.bridgelabz.AnnotationResource;

import org.springframework.stereotype.Component;

@Component("applicationUser")
public class ApplicationUser {

	String name = "Sid";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ApplicationUser [name=" + name + "]";
	}

}
