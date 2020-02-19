package com.company;

public class StringBufferDemo{

    public static void main(String[] args) {
	// write your code here
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Welcome to Java 13");
        System.out.println(sb.capacity());
        sb.append("this is question for batvch 1");
        System.out.println(sb.capacity());
        sb.insert(7, " and welcome");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.replace(7, 15, "correct value is written now");
        System.out.println(sb);
        sb.delete(7,20);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
