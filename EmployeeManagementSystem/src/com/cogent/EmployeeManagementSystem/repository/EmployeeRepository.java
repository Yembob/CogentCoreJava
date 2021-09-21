package com.cogent.EmployeeManagementSystem.repository;

import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeRepository {
	
	private Employee employees[] = new Employee[10];
	
	private static EmployeeRepository employeeRespository;
	private EmployeeRepository() {
		// TODO Auto
	}
	private static EmployeeRepository getInstance() {
		
		if(employeeRespository==null) {
			employeeRespository= new EmployeeRepository();
			return employeeRepository;
			
		}
		
		return employeeRepository;
		
	}
	
	static int counter = 0;//creating only 1 copy in memory* static helps us here
	public String addEmployee(Employee employee){
		// do we need to maintain the index for an employees array ?
		
		if(counter>=employees.length) {
			return "array is full";
		
		
	}
	employees[++counter] = employee;
	return "success";
	
	
}
	// this method should give us employee details on the basis of id
	public Employee getEmployeeById(String id) {
		
		for (Employee employee : employees) {
			
			if(employee!=null && id.equals(employee.getEmployeeId())) {
				return employee;
			}
			
		}
		return null;
	}
	


}
