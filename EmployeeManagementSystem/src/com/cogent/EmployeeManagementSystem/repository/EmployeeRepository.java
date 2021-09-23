package com.cogent.EmployeeManagementSystem.repository;
import com.cogent.EmployeeManagementSystem.model.Employee;
public interface EmployeeRepository {
		
		public String addEmployee(Employee employee);
		public String deleteEmployeeById(String id);
		public void deleteAllEmployees();
		public Employee getEmployeeById(String id);
		public Employee[] getEmployee();
		public String updateEmployee(String id, Employee employee);
		
		
		
		
	

}
