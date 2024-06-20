package com.wipro.Practice;

abstract class Account {
	protected double balance;
	public Account (double accountbalance) {
		this.balance=accountbalance;
	}
	abstract void deposit(double amt);
	abstract void withdraw(double amt);
	abstract double calculateInterest();

}
