package com.question1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		if (amount>1000) {
			Hotel H=new TajHotel();
//			TajHotel Taj=(TajHotel)H;
			return H;
		}
		else{
			Hotel H=new RoadSideHotel();
			//RoadSideHotel Road=(RoadSideHotel)H;
			return H;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter amount:");
		
		Demo D1=new Demo();
		int price=input.nextInt();
		if(price>200&&price<1000) {
			RoadSideHotel road=(RoadSideHotel)D1.provideFood(price);
			road.chickenBiryani();
			road.masalaDosa();
		}
		else if(price>1000) {
			TajHotel Taj=(TajHotel)D1.provideFood(price);
			Taj.welcomeDrink();
			Taj.chickenBiryani();
			Taj.masalaDosa();
		}
		else{
			System.out.println("Please Enter a valid amount");
		}
		
	}

}
