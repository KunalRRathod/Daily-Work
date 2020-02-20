package com.cognizantTraining;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Tree_Map_Demo {

    public static void main(String[] args) {
        // invoke the treemap function
        // treemap has two parameters <Key, Value>
        TreeMap<String, Integer> map = new TreeMap<>();
        // function.put() adds values in <K,V> format
        map.put("Apple", 120);
        map.put("Kiwi", 200);
        //map.put("Kiwi", 180);
        map.put("Banana", 40);
        map.put("Grapes", 50);
        System.out.println(map);
        // The get method brings values from key provi
        // ded
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
