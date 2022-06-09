package com.question1;

public class Main {
	
	public static void main(String[] args) {
		
		Member member=new Member();
		
		Manager Ma=new Manager();
		Ma.Name="Ram";
		Ma.Age=29;
		Ma.PhoneNumber="9876543210";
		Ma.Address="Home";
		Ma.Salary=29000.0;
		
		System.out.println("Manager :-");
		Ma.printSalary(Ma.Name,Ma.Age,Ma.PhoneNumber,Ma.Address,Ma.Salary);
		
		Employee Em=new Employee();
		Em.Name="Ramesh";
		Em.Age=23;
		Em.PhoneNumber="9878443210";
		Em.Address="Home";
		Em.Salary=20000.0;
		System.out.println("Employee :-");
		Em.printSalary(Em.Name,Em.Age,Em.PhoneNumber,Em.Address,Em.Salary);
		
	}
	
	
	
}
