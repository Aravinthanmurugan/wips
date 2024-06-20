package Lambda;

public class Mathsimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m=(a,b)->a+b;
		Maths sub=(a,b)->a-b;
		Maths mul=(a,b)->a*b;
		System.out.println("The  add "+m.add(10, 20)+", The Sub "+sub.add(20, 10)+", The Multiplication "+mul.add(20, 7));
		//Radius
		Circle c=r->3.141*r*r;
		System.out.println("The circle of Area :"+c.area(6));
		///Find Big 
		Bignum big=(a,b)-> b<a;
		System.out.println("The Big a "+big.findBig(20, 40));
		
	}

}
