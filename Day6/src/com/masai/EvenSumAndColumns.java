package com.masai;

public class EvenSumAndColumns {

	public static void main(String[] args) {
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for (int x=0;x<mat.length;x++) {
			int sum=0;
			for (int y=0;y<mat[x].length;y++) {
				if(mat[y][x]%2==0) {
					sum+=mat[y][x];
				}
			}
			System.out.println(sum);
		}

	}

}
