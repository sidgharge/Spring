package com.bridgelabz.AutoDetection.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service("dateService")
public class DateService implements IDateService {

	public Date getAssessmentDate() {
		return new Date();
	}

}
