package com.example.main;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Map {
  public static void main(String[] args) {
    HashMap<String, Integer> groceryList = new HashMap<>();

    groceryList.put("Milk", 2);
    groceryList.put("Eggs", 12);
    groceryList.put("Bread", 1);
    groceryList.put("Butter", 4);
    groceryList.remove("Butter");
    groceryList.put("Milk", 1);

    System.out.println("Don't forget to grab " 
    + groceryList.keySet().stream().collect(Collectors.joining(", ")).toLowerCase() + "!");
    // Output: Don't forget to grab eggs, milk, bread!
    
    System.out.println("The grocery list has " + groceryList.size() + " items.");
    // Output: The grocery list has 3 items.

    for (HashMap.Entry<String, Integer> item : groceryList.entrySet()) {
      System.out.println(item);
    }
    // Output:
    // Milk=1
    // Eggs=12
    // Bread=1
  }
}