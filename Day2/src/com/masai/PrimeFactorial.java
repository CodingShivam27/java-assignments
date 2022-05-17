package com.masai;

public class PrimeFactorial {
	
	public static void main(String[] arg) {
		int num=12;
		if (num<2||num>100) {
			System.out.println("Invelid number");
		}
		else {
			String bag="";
			for (int x=1;x<=num;x++) {
				if(num%x==0) {
					bag+=x+" ";
				}
			}
			System.out.println(bag);
		}
		
	}
}
