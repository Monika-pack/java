package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeService {



//public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	@RequestMapping("employee")
public List<Employee> getAllEmployee(){
	 List<Employee> employee=new ArrayList<Employee>();
	
	 employeeRepository.findAll().forEach(employee::add);
	 
	 return employee;
 }
 
 
	@RequestMapping(method=RequestMethod.POST, value="/employee/")
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

@RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
public void updateEmployee(Integer id, Employee employee) {
	employeeRepository.save(employee);
	
}

@RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
public void deleteEmployee(Integer id) {
	employeeRepository.deleteById(id);
	
}
}

