package com.question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan lone=new Loan();
		
		PermanentEmployee per=new PermanentEmployee(101,"shivam",0.0);
		TemporaryEmployee tem=new TemporaryEmployee(101,"shivam",1,2);
		lone.calculateLoanAmount(per);
		lone.calculateLoanAmount(tem);
		lone.calculateLoanAmount(null);
		
	}

}
