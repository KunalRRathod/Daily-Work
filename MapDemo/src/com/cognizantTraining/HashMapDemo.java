package com.cognizantTraining;
import java.util.HashMap; //import hashmap package
import  java.util.Map.Entry;
public class HashMapDemo {

    public static void main(String[] args) {
	// invoke the hashmap function
        // Hashmap has two parameters <Key, Value>
        HashMap<String, Integer> map = new HashMap<>();
        // function.put() adds values in <K,V> format
        map.put("Apple", 120);
        map.put("Kiwi", 200);
        //map.put("Kiwi", 180);
        map.put("Banana", 40);
        map.put("Grapes", 50);
        System.out.println(map);
        // The get method brings values from key provided
        System.out.println(map.get("Grapes"));
        // map.containsKey returns the boolean value in true false
        System.out.println(map.containsKey("Banana"));
        // clone() returns the same value
        System.out.println(map.clone());
        // Checks for value
        System.out.println(map.containsValue(300));
        // Checks if the values are present in the map or not , returns false if nothing is present
        System.out.println(map.isEmpty());
        // Checks for no. of elements in the map
        System.out.println(map.size());
        for (Entry<String, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey()+ " ---->"+entry.getValue());
        }
    }
}
