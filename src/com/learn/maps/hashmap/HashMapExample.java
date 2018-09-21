package com.learn.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        print(map);
        map.put("Tom", 10);
        map.put("Matt", 30);
        map.put("Pete", 20);

        System.out.println("Size of map is:- " + map.size());

        print(map);
        if (map.containsKey("Tom")) {
            Integer a = map.get("Tom");
            System.out.println("value for key \"Tom\" is:- " + a);
        }

        map.clear();
        print(map);
    }

    private static void print(Map<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("map is empty");
        } else {
            System.out.println(map);
        }
    }
}