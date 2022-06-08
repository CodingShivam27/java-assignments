package com.problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public double EmployeeBonus() throws InvalidAgeException{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the joining date");
		String sun=input.next();
		
		try {
			LocalDate d1 = LocalDate.parse(sun, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate c1 = LocalDate.now();
			Period p = Period.between(d1,c1);
			
			if(p.getYears()==0) {
				return 5000.0;
			}
			else if(p.getYears()==1) {
				return 8000.0;
			}
			else if(p.getYears()>=2) {
				return 10000.0;
			}
			else if(p.getYears()<0) {
				InvalidAgeException ia=new InvalidAgeException("Age should not be in the future");
				throw ia;
			}
			else {
				return 0.0;
			}

		}
		catch(Exception err) {
			InvalidAgeException iae=new InvalidAgeException("Please pass the date in the correct format");
			throw iae;
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main=new Main();
		try {
			double age=main.EmployeeBonus();
			System.out.println("Your bonus is : "+age);
			
		}
		catch(InvalidAgeException err) {
			System.out.println(err.getMessage());
		}
		
	}

}
