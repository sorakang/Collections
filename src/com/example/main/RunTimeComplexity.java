package com.example.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.example.main.Constants;

class Student {
  String name;
  int id;
  int grade;

  Student(String name, int id, int grade) {
    this.name = name;
    this.id = id;
    this.grade = grade;
  }
}

public class RunTimeComplexity {
  public static void main(String[] args) {
    Student[] students = new Student[Constants.STUDENT_NAMES.length];
    for (int i = 0; i < Constants.STUDENT_NAMES.length; i++) {
      students[i] = new Student(Constants.STUDENT_NAMES[i], Constants.STUDENT_IDS[i],
          Constants.STUDENT_GRADES[i]);
    }

    List<String> studentList = new ArrayList<>();
    for (Student student : students) {
      studentList.add(student.name);
    }

    long listStartTime = System.nanoTime();
    studentList.contains("Kevin");
    long listEndTime = System.nanoTime();
    System.out.println("Time taken to search for Kevin: " + (listEndTime - listStartTime) + " nanoseconds.");
    // Output: Time taken to search for Kevin: 3792 nanoseconds.

    Set<Integer> gradeSet = new TreeSet<>((a, b) -> b - a);
    for (Student student : students) {
      gradeSet.add(student.grade);
    }

    long treeStartTime = System.nanoTime();
    gradeSet.contains(40);
    long treeEndTime = System.nanoTime();
    System.out.println("Time taken to search for Kevin: " + (treeEndTime - treeStartTime) + " nanoseconds.");
    // Output: Time taken to search for Kevin: 2833 nanoseconds.

    Map<Integer, String> idMap = new HashMap<>();
    for (Student student : students) {
      idMap.put(student.id, student.name);
    }

    long hashStartTime = System.nanoTime();
    idMap.containsKey(1011);
    long hashEndTime = System.nanoTime();
    System.out.println("Time taken to search for Kevin: " + (hashEndTime - hashStartTime) + " nanoseconds.");
    // Output: Time taken to search for Kevin: 1042 nanoseconds.
  }
}