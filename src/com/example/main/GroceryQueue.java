package com.example.main;

import java.util.LinkedList;
import java.util.Queue;

public class GroceryQueue {
  public static void main(String[] args) {
    Queue<String> groceryList = new LinkedList<>();

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

    groceryList.poll();
    System.out.println("After removing the first item, the grocery list has " + String.join(", ", groceryList).toLowerCase() + " still!");
    // Output: After removing the first item, the grocery list has eggs, bread, milk still!
  }
}
