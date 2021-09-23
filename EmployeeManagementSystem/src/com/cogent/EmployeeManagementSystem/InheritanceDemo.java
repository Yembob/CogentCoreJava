package com.cogent.EmployeeManagementSystem;

import com.cogent.EmployeeManagementSystem.model.ProjectManager;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.model.Manager;

public class InheritanceDemo {

	public static final float PI = 3.14f;
	// TODO Auto-generated method stub
	public final int a;

	public int b;

	public InheritanceDemo() {
		this.a = 0;
	}

	/*
	 * Employee manager = new Manager(); // Parent type : child type // objects
	 * behavior completly depending on ref type.
	 * 
	 * System.out.println("emp id" + manager.getEmployeeId());
	 * 
	 * float salary = manager.calculateSalary(); System.out.println(salary);
	 * System.out.println(manager.calculateSalary());
	 * 
	 * Manager manager2 = (Manager) manager;//down casting
	 * 
	 * System.out.println(manager2.getProjectAllow()); ProjectManager pm = new
	 * ProjectManager(); Manager pm = new ProjectManager(); Employee pm = new
	 * ProjectManager();
	 */
	public static void main(String[] args) {
		final int b =100;
		System.out.println(b);

	}
}
