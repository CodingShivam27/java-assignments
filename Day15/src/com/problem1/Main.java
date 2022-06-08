package com.problem1;

import java.util.Scanner;

import javax.activity.InvalidActivityException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Main {

	public int age() throws InvalidActivityException {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your date of beath in this format dd-MM-yyyy");
		String dob=input.next();
		
		try{
			LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate c1 = LocalDate.now();
			Period p = Period.between(d1,c1);
			return p.getYears();
		}
		catch (Exception e){
			InvalidActivityException iae=new InvalidActivityException("InvalidDateFormat");
			throw iae;
		}
		
		
		//return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main=new Main();
		try {
			int age=main.age();
			if(age>0) {
				System.out.println("Your age is : "+age);
			}
			else {
				System.out.println("Data should not be in Future");
			}
		}
		catch(InvalidActivityException err) {
			System.out.println(err.getMessage());
		}
	}

}
