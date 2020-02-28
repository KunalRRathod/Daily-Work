package com.cognizant.Calculator;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
	private static EmployeeDAO employeeDao;
	private static Employee employee;
	
	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();
				
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
