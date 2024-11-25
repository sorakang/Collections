package com.example.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroceryList {
  public static void main(String[] args) {
    List<String> groceryList = new ArrayList<>();

    groceryList.add("Milk");
    groceryList.add("Eggs");
    groceryList.add("Bread");
    groceryList.add("Butter");
    groceryList.remove("Butter");
    groceryList.add("Milk");

    System.out.println("Don't forget to grab " + String.join(", ", groceryList).toLowerCase() + "!");
    // Output: Don't forget to grab milk, eggs, bread, milk!
    
    System.out.println("The grocery list has " + groceryList.size() + " items.");
    // Output: The grocery list has 4 items.

    for (String item : groceryList) {
      System.out.println(item);
    }
    // Output:
    // Milk
    // Eggs
    // Bread
    // Milk

    Collections.sort(groceryList);
    System.out.println("Alphabetically sorted grocery list: " + String.join(", ", groceryList).toLowerCase() + ".");
    // Output: Alphabetically sorted grocery list: bread, eggs, milk.
  }
}