package com.EmployeeSalaryCalculation;

public class EmployeeBean {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
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
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public void calculateNetSalary(int pfpercentage) {
		int PF=100-pfpercentage;
		double pf=(this.salary/100)*PF;
		this.netSalary=pf;
	}
	
	public void print() {
		System.out.println("Name : "+this.employeeName);
		System.out.println("Salary : "+this.salary);
		System.out.println("Net Salary : "+this.netSalary);
	}
	
	
}
