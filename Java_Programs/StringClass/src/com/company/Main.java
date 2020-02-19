package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String city = "Indore";
        String city2 = "Pune";
        String city3 = "Mumbai";
        String city4 = new String ("Indore");
        String city5 = new String ("Pune");
        String city6 = new String ("Mumbai");
        System.out.println(city == city4);
        System.out.println(city3.equals(city5));
        System.out.println(city3.length());

    }
}
