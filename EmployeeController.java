package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeService;



@RestController
public class EmployeeController {
	@Autowired
	private Employee employeeService;
	
	@RequestMapping("/employee/")
	public List<Employee> getAllSubjects()
	{
	     return employeeService.getAllmployee();
	}
  
	@RequestMapping(method=RequestMethod.POST, value="/employee/")
	public void addSubject(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
		
	}
	@RequestMapping(method=RequestMethod.PUT, value="/employee/{name}")
	public void updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		System.out.println("id="+id);
		employeeService.updateEmployee(id,employee);
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/{name}")
	public void deleteSubject(@PathVariable Integer id) {
		employeeService.deleteEmployee(id);
	}
}
