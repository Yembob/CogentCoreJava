package com.cogent.EmployeeManagementSystem.Service;

import com.cogent.EmployeeManagementSystem.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id);
	public Employee[] getEmployees();
	public String updateEmployee(String id, Employee employee);
	public static EmployeeService getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
