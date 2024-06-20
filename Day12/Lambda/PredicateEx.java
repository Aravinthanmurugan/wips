package Lambda;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <Integer> p1=n->n%2==0;
		Predicate<Integer> p2 = n -> {
			boolean isPrime = true;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		};
		Predicate <Integer> p3=n->n>15;
		Predicate <String> str=s-> s.length()>8;
		System.out.println("The even Number "+p1.test(44));
		System.out.println("Is prime Number "+p2.test(88));
		System.out.println("String length above 8  "+str.test("Aravinthan"));
		System.out.println(p3.and(p2).test(13));
		System.out.println(p3.or(p2).test(13));
		System.out.println(p1.negate().test(21));
	}

}
