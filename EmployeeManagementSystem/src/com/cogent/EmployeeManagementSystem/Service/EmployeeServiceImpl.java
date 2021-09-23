package com.cogent.EmployeeManagementSystem.Service;

import com.cogent.EmployeeManagementSystem.repository.EmployeeRepositoryImpl;
import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeServiceImpl {
	EmployeeRepositoryImpl employeeRepository = EmployeeRepositoryImpl.getInstance();

	public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);

	}

	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);

	}
public Employee[] getEmployees() {
	return employeeRepository.getEmployee();
	
}
	
}
