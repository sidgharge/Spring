package com.bridgelabz.AutowireNo;

public class Driver {

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
