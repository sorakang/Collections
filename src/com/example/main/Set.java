package com.example.main;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {
  public static void main(String[] args) {
    HashSet<String> groceryList = new HashSet<>();

    groceryList.add("Milk");
    groceryList.add("Eggs");
    groceryList.add("Bread");
    groceryList.add("Butter");
    groceryList.remove("Butter");
    groceryList.add("Milk");

    System.out.println("Don't forget to grab " + String.join(", ", groceryList).toLowerCase() + "!");
    // Output: Don't forget to grab eggs, milk, bread!
    
    System.out.println("The grocery list has " + groceryList.size() + " items.");
    // Output: The grocery list has 3 items.

    for (String item : groceryList) {
      System.out.println(item);
    }
    // Output:
    // Eggs
    // Milk
    // Bread

    TreeSet<String> sortedGroceryList = new TreeSet<>(groceryList);
    System.out.println("Alphabetically sorted grocery list: " + String.join(", ", sortedGroceryList).toLowerCase() + ".");
    // Output: Alphabetically sorted grocery list: bread, eggs, milk.
  }
}