package com.cognizant.Calculator;



public class Calculator {

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
		
	}
	public int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
		
	}
	public int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
		
	}
	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
		
	}
	public boolean isPrime(int number) {
		boolean flag = true;
		for (int i = 2; i<number/2;i++) {
			if(number%i == 0) {
				flag = false;
			}

		}
		return flag;
	}
	

}
