package com.cogent.EmployeeManagementSystem;
import com.cogent.EmployeeManagementSystem.model.Employee;
public class Main3 {
public static void main(String[] args) {
	Employee employee = new Employee();
	System.out.println(employee.hashCode());
	Employee employee2 = new Employee();
	System.out.println(employee2.hashCode());
	System.out.println(employee.equals(employee2));
	System.out.println(employee2.equals(employee));

}
}
