package com.problem1;

public class Account {

	public String accoutNumber;
	public double Balance;
	
	public void deposid(int amount) {
		this.Balance=this.Balance+amount;
	}
	
	public double withdrow(int amount)throws InsuffcientFundsException {
		double ans=0.0;
		if(amount<=this.Balance) {
			this.Balance=this.Balance-amount;
			ans=this.Balance;
		}
		else {
			InsuffcientFundsException ifx=new InsuffcientFundsException("Insuffcient Balance");
			throw ifx;
		}
		return ans;
	}
	
	public Account(String acc) {
		// TODO Auto-generated constructor stub
		this.accoutNumber=acc;
	}
	
}
