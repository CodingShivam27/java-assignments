package com.EmployeeSalaryCalculation;

import java.util.Scanner;

public class Demo {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=input.nextInt();
		input.nextLine();
		System.out.println("Enter Name");
		String name=input.nextLine();
		System.out.println("Enter Salary");
		double salary=input.nextInt();
		System.out.println("Enter PF percentage");
		int PF=input.nextInt();
		
		EmployeeBean bean=new EmployeeBean();
		bean.setEmployeeName(name);
		bean.setSalary(salary);
		bean.calculateNetSalary(PF);
		bean.print();
		
	}
}
