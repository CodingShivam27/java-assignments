package com.question2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Science Student Name:");
		String Sname=input.nextLine();
		//input.nextLine();
		
		System.out.println("Enter Science Student Address");
		String Sadd=input.nextLine();
		//input.nextLine();
		
		System.out.println("Enter phisicsMarks");
		int phisicsMarks=input.nextInt();
		
		System.out.println("Enter chemistryMarks");
		int chemistryMarks=input.nextInt();
		
		System.out.println("Enter mathsMarks");
		int mathsMarks=input.nextInt();
		
		ScienceStudent Sce=new ScienceStudent(Sname,Sadd);
		
		Sce.phisicsMarks=phisicsMarks;
		Sce.chemistryMarks=chemistryMarks;
		Sce.mathsMarks=mathsMarks;
		
		
		
		
		input.nextLine();
		System.out.println("Enter History Student Name:");
		String Hname=input.nextLine();
		//input.nextLine();
		
		System.out.println("Enter History Student Address:");
		String Hadd=input.nextLine();
		//input.nextLine();
		
		System.out.println("Enter HistoryMarks");
		int historyMarks=input.nextInt();
		
		System.out.println("Enter civicsMarks");
		int civicsMarks=input.nextInt();
		
		HistoryStudent His=new HistoryStudent(Hname,Hadd);
		
		His.historyMarks=historyMarks;
		His.civicsMarks=civicsMarks;
		
		Sce.getPercentage();
		
		His.getPercentage();
		
	}

}
