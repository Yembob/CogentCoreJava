package com.cogent.EmployeeManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private String employeeId;
	private String firstName,lastName;
	private float empSalary;
	private String address;
	public Employee() {
		this.employeeId="";
		
	}
	
	
	
	
	
}
