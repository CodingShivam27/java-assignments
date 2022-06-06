package com.question2;

public class TemporaryEmployee extends Employee {

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double salary=hoursWorked*hourlyWages;
		this.setSalary(salary);
	}

	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee() {
		
	}
	
	public TemporaryEmployee(int EmployeeId, String employeeName, int hoursWorked, int hourlyWages) {
		
	}
	
}
