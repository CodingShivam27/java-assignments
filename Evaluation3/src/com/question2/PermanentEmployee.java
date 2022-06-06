package com.question2;

public class PermanentEmployee extends Employee {

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double PfAmount=basicPay*0.12;
		double salary=basicPay-PfAmount;
		this.setSalary(salary);
	}
	
	private double basicPay;
	
	public PermanentEmployee(int employeeId,String employeeName,double basicPay) {
		
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.basicPay=basicPay;
		
	}
	
	public PermanentEmployee() {
		
	}
}
