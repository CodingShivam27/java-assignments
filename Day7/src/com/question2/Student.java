package com.question2;

public class Student {
	
	int studIdl;
	String studName;
	double examFee;
	
	void displayDetails(){
		
	}
	
	double payFee() {
		
		return 0.0;
	}

	public Student(int studIdl, String studName, double examFee) {
		this.studIdl = studIdl;
		this.studName = studName;
		this.examFee = examFee;
	}
	
}

class DayScholar extends Student{
	
	public DayScholar(int studIdl, String studName, double examFee) {
		super(studIdl, studName, examFee);
		// TODO Auto-generated constructor stub
	}

	double transportFee() {
		return 0.0;
	}
	
}

class Hosteller extends Student{
	
	public Hosteller(int studIdl, String studName, double examFee) {
		super(studIdl, studName, examFee);
		// TODO Auto-generated constructor stub
	}

	double hostelFee() {
		return 0.0;
	}
	
}
