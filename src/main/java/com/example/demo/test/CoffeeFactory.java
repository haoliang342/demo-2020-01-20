package com.example.demo.test;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {

    private static Map<Integer, Coffee> coffeeMap = new HashMap<>();

    public static void registerCoffee(int key, Coffee coffee){
        coffeeMap.put(key,coffee);
    }
    /**
     * 根据key，从缓存中获取coffee
     */
    public static Coffee getCoffee(int key){
        return coffeeMap.get(key);
    }

}
