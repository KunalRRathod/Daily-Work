//package com.cognizantTraining;
// import scanner class
import java.util.Scanner;
// class name
public class MethodApplication{
    // create method MethodApplication and pass two parameters
public static void add(int a, int b) {
    int sum = a + b;
    // return value 
    System.out.println(sum);
    
}
// Declaration of main method
public static void main(String[] args) {
    // initialize local variables
    int num1, num2;
    Scanner input = new Scanner(System.in);
    // Take user input
    num1 = input.nextInt();
    num2 = input.nextInt();
    // call method
    add(num1, num2);
}
}