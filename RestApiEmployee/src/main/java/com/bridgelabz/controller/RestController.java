package com.bridgelabz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bridgelabz.model.Employee;
import com.bridgelabz.services.DataServices;

@Controller
@RequestMapping("/employee")
public class RestController {

	@Autowired
	DataServices dataServices;
	
	@ResponseBody
	@RequestMapping(value="/create", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee){
		try {
			dataServices.addEntity(employee);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") int id) {
		Employee employee = null;
		try {
			employee = dataServices.getEntityById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	@ResponseBody
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Employee> getEmployee() {
		try {
			return dataServices.getEntityList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) {
		try {
			dataServices.deleteEntity(id);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
