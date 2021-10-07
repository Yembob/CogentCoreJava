package com.cogent.EmployeeManagementSystem;
import com.cogent.EmployeeManagementSystem.Service.EmployeeServiceImpl;
import com.cogent.EmployeeManagementSystem.Service.EmployeeService;
import com.cogent.EmployeeManagementSystem.model.Employee;

public class Main {

	// memory management Stack(Method) and Heap(Objects)(Runtime Applications)
	public static void main(String[] args) {

		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		Employee employee = new Employee("ab001", "abhi", "chivate", 123.0f, "PA");
		String result = employeeService.addEmployee(employee);
		System.out.println(result);

		Employee[] employees = employeeService.getEmployees();
		for (Employee employee2 : employees) {
			System.out.println(employee2);
	
		}
employeeService.getEmployeesByName("abhi");
	}

}
