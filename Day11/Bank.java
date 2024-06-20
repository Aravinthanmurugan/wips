package com.wipro.Practice;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account savingsAccount =new SavingsAccount(60000, 0.8);
		Account fixedAccount   =new FixedAccount(40000, 36, 1.4, 10000);//balance amt,term,interest,penalty.
		Account currentAccount =new CurrentAccount(30000, 20000);
		savingsAccount.deposit(10000);
		fixedAccount.withdraw(30000);
		currentAccount.deposit(15000);
		System.out.println("Savings Account "+savingsAccount.balance+" Interest : "+savingsAccount.calculateInterest());
		System.out.println("Current Account "+currentAccount.balance);
		System.out.println("Fixed Deposit Account "+fixedAccount.balance+" Interest : "+fixedAccount.calculateInterest());
	}

}
