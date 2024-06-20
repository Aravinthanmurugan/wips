package Lambda;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c = n -> {
			System.out.println("The square of n is "+ n*n);
			System.out.println("The half of n is "+n/2);
			
			
		};
		
		c.accept(10);
	}

}
