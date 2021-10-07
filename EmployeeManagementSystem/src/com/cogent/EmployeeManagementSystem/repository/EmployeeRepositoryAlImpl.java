package com.cogent.EmployeeManagementSystem.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeRepositoryAlImpl implements EmployeeRepository {
//singleton dp
//<Employee ====> we are informing that we will hold only Employee type object.
//so we can keep adding them
//self growable
	private EmployeeRepositoryAlImpl() {
		// TODO Auto
	}

	public static EmployeeRepositoryAlImpl getInstance() {

		if (employeeRespository == null) {
			employeeRespository = new EmployeeRepositoryAlImpl();
			return employeeRespository;

		}

		return employeeRespository;

	}
//10 employees	
private ArrayList<Employee> employees = new ArrayList<>();

	
	
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean status = employees.add(employee);
		if (status)
			
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException() {
		// TODO Auto-generated method stub
		Employee employee = this.getEmployeeById(id);
		
		if(employee!=null) {
			employees.remove(employee);
			if(status) {
				return "success";
			}
		}
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employees(clear);
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if(id.equals(employee.getEmployeeId()))
			return employee;
		}
		return null;
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		Employee employee[] = new Employee[employees.size()];
		return employees.toArray(employee);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
		@Override
			public boolean isEmployeeExists(String id) {
				// TODO Auto-generated method stub
			for (Employee employee : employees) {
				if(id.equals(employee.getEmployeeId()))
				return true;
			}
		
		return false;
	}

}
