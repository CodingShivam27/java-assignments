package com.StudentBean;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner details=new Scanner(System.in);
		
		System.out.println("Enter the Roll Number :");
		int rollNumber=details.nextInt();
		System.out.println("Enter the Name");
		String StudentName=details.nextLine();
		details.nextLine();
		System.out.println("Enter Marks");
		int studentMarks=details.nextInt();
		
		Student obj=new Student(rollNumber,StudentName,studentMarks);
		
		
	}

}
