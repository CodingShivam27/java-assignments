package com.question4;

import java.util.Scanner;

public class Demo {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter no of students");
		int length=input.nextInt();
		
		StudentBean[] arr=new StudentBean[length];
		
		int sum=0;
		
		for (int x=0;x<arr.length;x++) {
			arr[x]=new StudentBean();
			System.out.println("enter Student Name:"+(x+1));
			String name=input.nextLine();
			input.nextLine();
			arr[x].setName(name);
			
			System.out.println("enter Student Roll No:"+(x+1));
			int roll=input.nextInt();
			arr[x].setRoll(roll);
			System.out.println("enter Student Marks"+(x+1));
			int marks=input.nextInt();
			arr[x].setMarks(marks);
			sum+=marks;
			System.out.println("enter Address"+(x+1));
			String address=input.nextLine();
			input.nextLine();
			arr[x].setAddress(address);

		}
		System.out.println("Average marks is : "+(sum/arr.length));
		int num=0;
		for (StudentBean i:arr) {
			num++;
			System.out.println("------------");
			System.out.println("Student "+num);
			System.out.println("------------");
			System.out.println("Student Name : "+i.getName());
			System.out.println("Student Roll No : "+i.getRoll());
			System.out.println("Student Marks : "+i.getMarks());
			System.out.println("Student Address : "+i.getAddress());
			
		}
	}
	
	
	
	
}
