package com.question2;

public class HistoryStudent extends Student {

	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
	int historyMarks;
	int civicsMarks;
	
	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		float marks=(this.historyMarks+this.civicsMarks)/2;
		System.out.println("Name : "+this.name);
		System.out.println("percentage : "+marks+"%");
	}
	
	
	
}
