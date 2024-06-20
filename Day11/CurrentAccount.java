package com.wipro.Practice;

public class CurrentAccount extends Account {
	private double limit;

	public CurrentAccount(double accountbalance, double limit) {
		super(accountbalance);
		this.limit = limit;
	}

	@Override
	void deposit(double amt) {
		// TODO Auto-generated method stub
		balance+=amt;
	}

	@Override
	void withdraw(double amt) {
		// TODO Auto-generated method stub
		if(balance-amt>=limit) {
			balance-=amt;
		}else {
			System.out.println("Withdraw amount exceeds limit !! ");
		}
	}

	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
