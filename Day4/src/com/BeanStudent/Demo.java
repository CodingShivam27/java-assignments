package com.BeanStudent;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name");
		String name=input.nextLine();
		System.out.println("Enter roll number");
		int roll=input.nextInt();
		System.out.println("Enter age");
		int age=input.nextInt();
		System.out.println("Enter marks");
		int marks=input.nextInt();
		
		StudentBean student1=new StudentBean();
		student1.setRoll(roll);
		student1.setName(name);
		student1.setAge(age);
		student1.setMarks(marks);
		StudentBean student2=new StudentBean(roll,name,age,marks);
		
		if(age<18||age>60) {
			System.out.println("invalid age");
		}
		else {
			if(marks<0||marks>500) {
				System.out.println("invalid marks");
			}
			else {
				System.out.println("Student1 details:");
				student1.showDetails();
				System.out.println("Student2 details");
				System.out.println(student2.getRoll());
				System.out.println(student2.getName());
				System.out.println(student2.getAge());
				System.out.println(student2.getMarks());
			}
		}
		
		
		
	}

}
