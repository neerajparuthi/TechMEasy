package com.techm.entity;

import org.springframework.context.annotation.Bean;

public class Address {

	private String empCountry;
	private String empCity;
	private Integer empPincode;
	
	@Bean
	public void showBean(){
		System.out.println("This data is from the Bean");
	}
	
	public String getEmpCountry() {
		return empCountry;
	}
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public Integer getEmpPincode() {
		return empPincode;
	}
	public void setEmpPincode(Integer empPincode) {
		this.empPincode = empPincode;
	}
	
	
}
