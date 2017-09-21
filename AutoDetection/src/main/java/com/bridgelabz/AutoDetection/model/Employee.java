package com.bridgelabz.AutoDetection.model;

import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private Date assessmentDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", assessmentDate=" + assessmentDate + "]";
	}

}
