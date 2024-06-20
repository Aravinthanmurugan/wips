package tdd;
import java.util.*;

public class Testex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=in.nextInt();
		Ex1 ex=new Ex1();
		int res=UserMaincode.checksum(n);
		int res1=UserMaincodesum.sumOfSqureEven(n);
		System.out.println("o/p:"+res1);
		
	}

}
