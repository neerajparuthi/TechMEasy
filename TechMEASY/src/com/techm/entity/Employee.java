package com.techm.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;



public class Employee {

	
	@Size(min=4,max=30, message="Name should be between {min} to {max} characters")
	private String empName;
	
	@Min(value=18, message="Age should be minimum 18")
	@Max(value=75, message="Age can not be more than 75")
	private int empAge;
	
	
	private long empMobile;
	private Address address;
	

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public long getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(long empMobile) {
		this.empMobile = empMobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
