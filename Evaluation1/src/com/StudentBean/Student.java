package com.StudentBean;

public class Student {

	private int rollNumber;
	private String studentName;
	private int marks;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
		
	}
	public Student(int roll,String name,int marks) {
		this.setRollNumber(roll);
		this.setMarks(marks);
		this.setStudentName(name);
		System.out.println("Student Roll Number:"+this.getRollNumber());
		System.out.println("Student Name:"+this.getStudentName());
		System.out.println("Student Marks:"+this.getMarks());
		
	}

}
