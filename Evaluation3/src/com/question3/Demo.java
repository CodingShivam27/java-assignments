package com.question3;

import java.util.Scanner;

public class Demo {

	public void showDetails(Month m) {
		
		switch(m) {
		case JAN:System.out.println("This is the 1st Month of the Year January");
				 break;
		case FEB:System.out.println("This is the 1st Month of the Year January");
				 break;
		case MAR:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case APR:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case MAY:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case JUN:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case JUL:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case AUG:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case SEP:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case OCT:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case NOV:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		case DEC:System.out.println("This is the 1st Month of the Year January");
		 		 break;
		default :System.out.println("Invalid Month Name");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Month Name");
		String name=input.next();
		Month mo=Month.valueOf(name);
		Demo d1=new Demo();
		d1.showDetails(mo);
		}
		catch(IllegalArgumentException err) {
			System.out.println("Invalid Month Name");
		}
	}

}
