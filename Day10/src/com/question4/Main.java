package com.question4;

public class Main {

	public static void main(String[] args) {
		
		Area area=new Area();
		
		int rec=area.rectangleArea(10, 15);
		System.out.println("area of rectangle is : "+rec);
		int squ=area.squareArea(3);
		System.out.println("area of square is : "+squ);
		int cir=area.circleArea(3);
		System.out.println("area of circle : "+cir);
		
		
	}
	
	
}
