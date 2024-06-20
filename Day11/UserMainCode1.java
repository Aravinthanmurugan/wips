package com.wipro.Practice;

import java.util.Scanner;

public class UserMainCode1 {

	static int sumOfSqureEven(int n) {
		int sum=0;
		while (n>0) {
			int num=n%10;
			if(num%2==0) {
				sum+=num;
			}
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=in.nextInt();
		int res=sumOfSqureEven(n);
		System.out.println("o/p:"+res);
	}

}
