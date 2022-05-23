package com.masai;

import java.util.Scanner;

public class Course {

	public int courseId;
	public String courseName;
	public int courseFee;
	
	
	public void displayCourseDetails() {
		Course details=new Course();
		System.out.println("course Id : "+details.courseId);
		System.out.println("course Name : "+details.courseName);
		System.out.println("course Fee : "+details.courseFee);
	}
	
	public static void authenticate(String name,String password) {
		if(name=="Admin"&&password=="1234") {
			Course details=new Course();
			Scanner input=new Scanner(System.in);
			System.out.println("Enter course Id");
			int id=input.nextInt();
			details.courseId=id;
			input.nextLine();
			System.out.println("Enter course Name");
			String cname=input.nextLine();
			details.courseName=cname;
			System.out.println("Enter course Fee");
			int fee=input.nextInt();
			details.courseFee=fee;
			
			
			
			details.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
		
	}
	public static String username(String username) {
		
		return username;
		
	}
	
	public static String password(String password) {
		
		return password;
		
	}
	
	
	public static void main(String[] args) {
		
		
		authenticate(username("Admin"),password("1234"));
		authenticate(username("shivam"),password("1234"));
		
	}
	

}
