package tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathameticsTset {
	Mathametics m;
	@Before
	public void setUp() {
		m=new Mathametics();
	}
	@After
	public void tearDown() {
		m=null;
	}
	@Test
	public void test() {
		System.out.println("Hello Junit");
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testBothNumbersArePositive() {
		//Mathametics m=new Mathametics();
		assertEquals(50, m.add(10, 40));
		assertEquals(30, m.sub(40, 10));
		assertEquals(400, m.mul(10, 40));
		assertEquals(2, m.div(100, 40));
	}
	@Test
	public void testBothNumbersAreNegative() {
		//Mathametics m=new Mathametics();
		assertEquals(-50, m.add(-10, -40));
	}
	@Test
	public void testWhenOneisNegative() {
	//	Mathametics m=new Mathametics();
		assertEquals(-10, m.add(10, -20));
	}
	@Test
	public void testBothNumbersAreZero() {
		//Mathametics m=new Mathametics();
		assertEquals(0, m.add(0, 0));
	}

}
