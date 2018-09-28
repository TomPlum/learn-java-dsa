package com.learn.maps.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //Initial Capacity: 16, Default Load Factor: 0.75
        HashMap<String, String> hashMap = new HashMap<>();

        //Add Some Elements
        hashMap.put("Processor", "Intel i7 5820K");
        hashMap.put("Graphics Card", "GTX1080");
        hashMap.put("Memory", "64GB");

        //Retrieve Elements (Manually)
        System.out.println("Printing out elements manually...\n");
        String CPU = hashMap.get("Processor");
        System.out.println("Processor: " + CPU);
        String GPU = hashMap.get("Graphics Card");
        System.out.println("Graphics Card: " + GPU);
        String RAM = hashMap.get("Memory");
        System.out.println("Memory: " + RAM);

        //Get EntrySet (A set of mapped entries)
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        System.out.println("Printing out elements with an iterator...\n");
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        //Get KeySet (A set of keys from the HashMap)
        Set<String> keySet = hashMap.keySet();
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : keySet) {
            stringBuilder.append(key).append(", ");
        }
        System.out.println(stringBuilder.toString());
    }
}