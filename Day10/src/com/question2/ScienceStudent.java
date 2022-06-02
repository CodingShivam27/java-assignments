package com.question2;

public class ScienceStudent extends Student {

	public ScienceStudent(String name, String address) {
		super(name, address);
		
	}
	int phisicsMarks;
 	int chemistryMarks;
	int mathsMarks;
	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		float marks=(this.chemistryMarks+this.mathsMarks+this.phisicsMarks)/3;
		System.out.println("Name : "+this.name);
		System.out.println("percentage : "+marks+"%");
		
	}
	
	
	
}
