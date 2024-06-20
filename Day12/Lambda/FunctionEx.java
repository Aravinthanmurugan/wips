package Lambda;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f1 = n -> n*n;
		Function<Integer,Integer> f2 = n -> n/2;
		Function<Integer,Integer> f3 = n ->{
				int fact=1;
				for(int i=2;i<=n;i++)
					fact=fact*i;
				return fact;
		};
		System.out.println(f1.apply(4));
		System.out.println(f1.apply(10));
		System.out.println(f2.apply(18));
		System.out.println(f2.apply(400));
		System.out.println("Facotiral of 4 is "+f3.apply(4));
		System.out.println("factorial of 6 is : "+f3.apply(6));
	}

}
