package com.cognizantTraining;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int increment_by_2 = 0, increment_by_4= 0;
        Scanner input = new Scanner(System.in);
        // First num input from user
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        //int increment_by_2 = number1 +2;

        for (int i = 1; i <=10; i++){
            if (i%2 == number1) {
                increment_by_2 = number1 + 2;
                System.out.print(increment_by_2+",");
            }
            else {
                increment_by_4 = increment_by_2 + 4;
                System.out.print(increment_by_4+",");
            }
        }



    }
}
