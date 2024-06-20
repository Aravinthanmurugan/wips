package com.wipro.Practice;

public class SavingsAccount extends Account {
	private double interest;

	public SavingsAccount(double accountbalance, double interest) {
		super(accountbalance);
		this.interest = interest;
	}
	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		balance+=amt;
	}
	@Override
	public  void withdraw(double amt) {
		// TODO Auto-generated method stub
		if(balance>=amt) {
			balance-=amt;
		}else {
			System.out.println("Insufficient Founds !! ");
		}
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return balance*interest;
	}

	
	

}
