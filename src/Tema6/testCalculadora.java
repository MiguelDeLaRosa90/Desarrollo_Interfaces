package Tema6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCalculadora {
	
	Calculadora calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
				
	}
	
	@org.junit.AfterClass
	public static void AfterClass() {
		System.out.println("afterClass");
	}
	
	@Before
	public void before() {
		System.out.println("before");
		calc = new Calculadora();
	}	
	
	@After
	public void after() {
		System.out.println("After");
	}

	@Test
	public void TestSumar() {
		
		System.out.println("Sumar");
		
		int num1 = 2;
		int num2 = 3;
		int expected = 5;
		int sumar = calc.sumar(num1, num2);
		
		assertEquals(expected, sumar);
	}
	
	@Test
	public void TestResta() {
		System.out.println("Restar");

		
		int num1 = 2;
		int num2 = 3;
		int expected = -1;
		int restar = calc.resta(num1, num2);
		
		assertEquals(expected, restar);
	}
	
	@Test
	public void TestDividir() {
		System.out.println("dividir");
		double num1 = 4;
		double num2 = 2;
		double expected = 2;
		double division = calc.dividir(num1, num2);
		
		System.out.println("division"+division);
		
		assertEquals(expected, division, 0.001);
		
	}
	
	
	

}
