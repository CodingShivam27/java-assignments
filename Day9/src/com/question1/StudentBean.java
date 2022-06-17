package com.question1;

public class StudentBean {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	
	public void displayDetails() {
		
		StudentBean bean=new StudentBean(roll, name, marks, grade);
		
	}
	
	
	private char calculatGrade(int marks) {
		
		if (marks>=500) {
			return 'A';
		}
		else if(marks>=400&&marks<500) {
			return 'B';
		}
		else {
			return 'C';
		}
	}

	@Override
	public String toString() {
		return "StudentBean [roll=" + roll + ", name=" + name + ", Gread="+ calculatGrade(marks) +", marks=" + marks + ", grade=" + grade + "]";
	}

	public StudentBean(int roll, String name, int marks, char i) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = i;
	}
	
	
	
	
	
}
