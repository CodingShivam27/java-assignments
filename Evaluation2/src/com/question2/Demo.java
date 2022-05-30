package com.question2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Number of Student's");
		int num=input.nextInt();
		StudentBean[] arr=new StudentBean[num];
		
		for (int x=0;x<num;x++) {
			arr[x]=new StudentBean();
			System.out.println("Enter Student Name:");
			String name=input.nextLine();
			arr[x].setName(name);
			input.nextLine();
			
			System.out.println("Enter Student Roll No:");
			int roll=input.nextInt();
			arr[x].setRoll(roll);
			
			System.out.println("Enter Student Address:");
			String add=input.nextLine();
			arr[x].setAddress(add);
			input.nextLine();
			
			System.out.println("Enter Student Marks:");
			int marks=input.nextInt();
			arr[x].setMarks(marks);
		}
		int n=0;
		int sum=0;
		for (StudentBean i: arr) {
			sum+=i.getMarks();
			System.out.println("Student "+(n+1));
			System.out.println("==================");
			System.out.println("Student Name:"+i.getName());
			System.out.println("Student Roll No:"+i.getRoll());
			System.out.println("Student Address:"+i.getAddress());
			System.out.println("Student Marks:"+i.getMarks());
			System.out.println("==================");
		}
		
		System.out.println("Average of all Student marks is:"+(sum/num));
		
	}
}
