package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class StringSort
{
    // Method to sort a string alphabetically
    public static String sortString(String inputString)
    {
        // convert input string to char array
        char[] tempArray = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    // Main Method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + outputString);
    }
}