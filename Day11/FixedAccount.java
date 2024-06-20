package com.wipro.Practice;

public class FixedAccount extends Account{
	private int term;
	private double interest;
	private double penalatyamt;
	public FixedAccount(double accountbalance, int term, double interest, double penalatyamt) {
		super(accountbalance);
		this.term = term;
		this.interest = interest;
		this.penalatyamt = penalatyamt;
	}
	@Override
	void deposit(double amt) {
		// TODO Auto-generated method stub
		balance+=amt;
	}
	@Override
	void withdraw(double amt) {
		// TODO Auto-generated method stub
				if(balance-penalatyamt>=amt) {
					balance-=amt;
				}else {
					System.out.println("Withdraw Not Allowed !! ");
				}
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		return balance*interest*term/12;
	}
	
}
