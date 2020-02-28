package com.cognizantTraining;

public abstract class X {
	public void display() {
		System.out.print("X");
	}
	public abstract int sleepingHours();
    
}
	class Child extends X {
	String sing() {
	return null;
	}

	 public int sleepingHours()
	 {
		 return 8;
	 }
 }

 class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new Child();
		x.sleepingHours();
		
		Child c  = new Child();
		c.sleepingHours();
		c.sing();

	}

}
