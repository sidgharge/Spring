package com.bridgelabz.AutowireByConstructor;

public class Place {

	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Place [city=" + city + "]";
	}

}
