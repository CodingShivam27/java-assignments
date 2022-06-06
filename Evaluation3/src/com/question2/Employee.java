package com.question2;

public abstract class Employee {
	
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public Employee() {
		
	}
	
	public Employee(int employeeId,String employeeName) {
		
	}
	
	public abstract void calculateSalary();
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
