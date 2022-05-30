package com.question3;

public class OLA {

	public CarBean bookCar(int numberOfPassenger, int numberOfKMs){
		
		if(numberOfPassenger<=3) {
			HatckBack obj=new HatckBack();
			obj.setNumberOfPassenger(numberOfPassenger);
			obj.setNumberOfms(numberOfKMs);
			
			return obj;
		}
		else {
			Sedan obj=new Sedan();
			obj.setNumberOfPassenger(numberOfPassenger);
			obj.setNumberOfms(numberOfKMs);
			
			return obj;
		}
	}
	
	public int CalculateBill(CarBean car) {
		
		//int TotalFare=car.getNumberOfms()*car
		if(car.getNumberOfPassenger()<=3) {
			HatckBack obj=(HatckBack)car;
			int TotalFare= obj.farePerkm*obj.getNumberOfms();
			return TotalFare;
		}
		else {
			Sedan obj=(Sedan)car;
			int TotalFare= obj.farePerkm*obj.getNumberOfms();
			return TotalFare;
		}
	}
}
