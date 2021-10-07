package com.cogent.EmployeeManagementSystem.repository;

import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private Employee employees[] = new Employee[10];

	private static EmployeeRepositoryImpl employeeRespository;

	private EmployeeRepositoryImpl() {
		// TODO Auto
	}

	public static EmployeeRepositoryImpl getInstance() {

		if (employeeRespository == null) {
			employeeRespository = new EmployeeRepositoryImpl();
			return employeeRespository;

		}

		return employeeRespository;

	}

	static int counter = 0;// creating only 1 copy in memory* static helps us here

	public String addEmployee(Employee employee) {
		// do we need to maintain the index for an employees array ?

		if (counter >= employees.length) {
			return "array is full";

		}
		employees[++counter] = employee;
		return "success";

	}

	// this method should give us employee details on the basis of id
	public Employee getEmployeeById(String id) {

		for (Employee employee : employees) {

			if (employee != null && id.equals(employee.getEmployeeId())) {
				return employee;
			}

		}
		return null;
	}

	public Employee[] getEmployees() {
		return employees;

	}

//Deletion
	public String deleteEmployeeById(String id) {
		Employee employee = this.getEmployeeById(id);
		// 1 that id exists or not
		if (employee != null) {
			int index = this.getIndex(employee);

			if (index != -1) {
				employees[index] = null;
				return "Success";
			}
		}

		else

		{
			return "not found";
		}

		// 2 id exists then set null to location
		// if return not found

		return "not found";
	}

//getting employee object directly Delete
	private int getIndex(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].equals(employee)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee[] getEmployee() {
		// TODO Auto-generated method stub
		
		return null;
	}

@Override
public String updateEmployee(String id, Employee employee) {
	// TODO Auto-generated method stub
	return null;}
//searching for name
	private static int index = 0;

	public Employee[] getEmployeesByName(String name) {
		{
			for(Employee employee : employees) {
		Employee[] employeesTemp= new Employee[employees.length];
		if(employee.getFirstName().equals(name)) {
			employeesTemp[index++] = employee;
			
		}
	}
			Employee[] employeesTemp = null;
			return employeesTemp;

}

}

}
