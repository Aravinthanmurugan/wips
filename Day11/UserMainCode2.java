package com.wipro.Practice;

import java.util.Scanner;

public class UserMainCode2 {
	static int reverseNumber(int n) {
		int rev=0;
		while(n!=0) {
			int num=n%10;
			rev=rev*10+num;
			n/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=in.nextInt();
		int res=reverseNumber(n);
		System.out.println("o/p: "+res);

	}

}
