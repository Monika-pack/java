package com.example.demo.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	private int eid;
	
	private String ename;
	
	private float esalary;
	
	private long econtact;
	
	private String edept;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public long getEcontact() {
		return econtact;
	}

	public void setEcontact(int econtact) {
		this.econtact = econtact;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", econtact=" + econtact
				+ ", edept=" + edept + "]";
	}

	public List<Employee> getAllmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void updateEmployee(Integer id, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	
		
	}

