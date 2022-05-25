package com.masai;

public class FactorialOfTheNumber {

	public static void main(String[] args) {
		if(args.length==1) {
			int gg= Integer.parseInt(args[0]);
			int sum=1;
			for (int x=1;x<=gg;x++) {
				sum*=x;
			}
			System.out.println(sum);
		}
		else if(args.length==2) {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int abs=Math.abs(a-b);
			int sum=1;
			for (int x=1;x<=abs;x++) {
				sum*=x;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("Error");
		}

	}
}
