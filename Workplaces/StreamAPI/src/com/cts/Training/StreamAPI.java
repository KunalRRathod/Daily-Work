package com.cts.Training;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		//addNames(names);
		// System.out.println(names);

		// 1. Print names with length more then 6
		List<String> namesWithSizelessThan6 = names.stream().filter(str -> str.length() > 6)
				.collect(Collectors.toList());
		System.out.println(namesWithSizelessThan6);
		namesWithSizelessThan6.forEach(System.out::println);
		
		// 2. Print names in upper case
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		namesInUpper.forEach(System.out::println);
		
		long count = names.stream().count();
		System.out.println("List count is "+count);
		
		ArrayList<String> lang = new ArrayList<>();
		//Filter out values
		addLanguages(lang );
		/*
		List<String> namesFilteredgreaterthan4 =
				lang.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
		namesFilteredgreaterthan4.forEach(System.out::println);
		List<String> namesaddprogr =
				lang.stream().map(str -> str.concat(" Programming")).collect(Collectors.toList());
		namesaddprogr.forEach(System.out::println);
		*/
		List<String> customSorting = lang.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		customSorting.forEach(System.out::println);

	}

	/*private static void addNames(ArrayList<String> names) {
		names.add("Kunal");
		names.add("Sonu Chaturvedi");
		names.add("Parth");

	} */
	private static void addLanguages(ArrayList<String> lang) {
		lang.add("C");
		lang.add("C++");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
	}

}
