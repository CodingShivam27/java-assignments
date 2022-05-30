package com.question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Number of Passenger");
		int NOfP=input.nextInt();
		System.out.println("Enter Number of Kms");
		int Kms=input.nextInt();
		
		OLA BookCar=new OLA();
		
		if(NOfP<=3) {
			CarBean obj= BookCar.bookCar(NOfP, Kms);
			HatckBack HB=(HatckBack)obj;
			System.out.println("The total fare amount is"+BookCar.CalculateBill(HB));
		}
		else {
			CarBean obj= BookCar.bookCar(NOfP, Kms);
			Sedan HB=(Sedan)obj;
			System.out.println("The total fare amount is"+BookCar.CalculateBill(HB));
		}
		
		
		
		
		
		

	}

}
