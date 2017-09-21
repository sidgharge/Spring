package com.bridgelabz.AnnotationAutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {

	@Autowired
	License license;

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	@Override
	public String toString() {
		return "Driver [license=" + license + "]";
	}

}
