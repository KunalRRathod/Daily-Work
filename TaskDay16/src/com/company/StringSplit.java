package com.company;
import java.util.*;
public class StringSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usrstr = input.nextLine();
        String [] arr = usrstr.split(" ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
