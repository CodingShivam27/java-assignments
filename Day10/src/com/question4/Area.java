package com.question4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		int ans=length*breadth;
		return ans;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int ans=side*side;
		return ans;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		int ans=(int) (3.14*(radius*2));
		return ans;
	}

}
