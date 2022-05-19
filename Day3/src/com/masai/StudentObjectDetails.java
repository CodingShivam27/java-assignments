package com.masai;

public class StudentObjectDetails {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int roll,int marks,String name) {
		System.out.println(name);
		System.out.println(roll);
		System.out.println(marks);
	}
	
	public static void main(String[] args) {
		
		StudentObjectDetails student1= new StudentObjectDetails();
	
		student1.roll=15;
		student1.marks=300;
		student1.name="Shivam";
		student1.displayStudentDetails(student1.roll,student1.marks,student1.name);
		student1=null;
		
		
		StudentObjectDetails student2= new StudentObjectDetails();
		student2.roll=10;
		student2.marks=300;
		student2.name="Roshan";
		student2.displayStudentDetails(student2.roll,student2.marks,student2.name);
		student2=null;
	}

}
