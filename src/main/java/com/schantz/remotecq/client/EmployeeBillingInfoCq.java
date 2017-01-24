package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EmployeeBillingInfoCq implements Serializable {
	@JsonProperty("salary")
	private Double salary = null;
	
	@JsonProperty("salaryInArrear")
	private Boolean salaryInArrear = false;
	
	@JsonProperty("employeeBillingTypeCq")
	private String employeeBillingTypeCq = null;
	
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Boolean getSalaryInArrear() {
		return salaryInArrear;
	}
	
	public void setSalaryInArrear(Boolean salaryInArrear) {
		this.salaryInArrear = salaryInArrear;
	}
	
	public String getEmployeeBillingTypeCq() {
		return employeeBillingTypeCq;
	}
	
	public void setEmployeeBillingTypeCq(String employeeBillingTypeCq) {
		this.employeeBillingTypeCq = employeeBillingTypeCq;
	}
}

