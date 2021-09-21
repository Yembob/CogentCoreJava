package com.cogent.EmployeeManagementSystem.Service;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepository;
import com.cogent.EmployeeManagementSystem.model.Employee;




public class EmployeeService {
EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
	



public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	
	}
	
	
public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
		
	}
	
}
