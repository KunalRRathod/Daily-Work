package com.cognizant.Calculator;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class Test1 {
	private static Calculator calc;
	@BeforeClass
	public static void init() {
		calc = new Calculator();
		System.out.println("Object Created >>>");
	}
	@AfterClass 
	public static void destroy() {
		// TODO Auto-generated method stub
		calc = null;
		System.out.println("Object Destroyed >>>");

	}

	@Ignore
	@Test
	public void test_add_success() {
	
		assertEquals(17, calc.add(12,5));
		System.out.println("Inside Add Test");
	}
	@Ignore
	@Test
	public void test_sub_success() {
		
		assertEquals(7, calc.subtract(12,5));
		System.out.println("Inside Subs Test");
	}
	@Ignore
	@Test
	public void test_mult_success() {
		
		assertEquals(21, calc.multiply(7,3));
		System.out.println("Inside Multiply Test");
	}
	@Ignore
	@Test
	public void test_div_success() {
		
		assertEquals(2, calc.divide(10,5));
		System.out.println("Inside Divide Test");
	}
	@Test
	public void test_to_check_prime_num() {
		assertEquals(false, calc.isPrime(0));
	}

}
