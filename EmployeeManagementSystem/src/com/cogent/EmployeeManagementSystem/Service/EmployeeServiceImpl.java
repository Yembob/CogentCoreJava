package com.cogent.EmployeeManagementSystem.Service;
import java.io.IOException;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepositoryImpl;
import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeServiceImpl {
	EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
// are we consuming the repo?
	
	// loose coupling:
	public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);

	}

	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeById(id);

	}
public Employee[] getEmployees() {
	return employeeRepository.getEmployee();
	
}
	
}
