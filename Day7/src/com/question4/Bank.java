package com.question4;

public class Bank {
	
	String branchName="ghonda";
	String IfscCode;
	
	void displayDetails(String branchName,String IfscCode) {
		
	}
	
}

class AxisBank extends Bank{
	double rateOfInterest=0.0;
	void displayDetails(String branchName,String IfscCode,double rateOfInterest) {
		
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class ICICIBank extends Bank{
	double rateOfInterest;
}
