package com.question1;

class Member {

	public String Name;
	public int Age;
	public String PhoneNumber;
	public String Address;
	public double Salary;
	
	void printSalary(String name,int age, String phoneNumber,String Address,double Salary) {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("PhoneNumber :"+phoneNumber);
		System.out.println("Address :"+Address);
		System.out.println("Salary :"+Salary);
	}
		
}
class Manager extends Member{
	
	
}

class Employee extends Member{
	
	
}