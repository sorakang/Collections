package com.example.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import com.example.main.StudentConstants;

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
    Student[] students = new Student[StudentConstants.STUDENT_NAMES.length];

    for (int i = 0; i < StudentConstants.STUDENT_NAMES.length; i++) {
      students[i] = new Student(StudentConstants.STUDENT_NAMES[i], StudentConstants.STUDENT_IDS[i],
          StudentConstants.STUDENT_GRADES[i]);
    }

    // for (Student student : students) {
    //   System.out.println("Name: " + student.name + ", ID: " + student.id + ", Grade: " + student.grade);
    // }
    /* Output:
     * Name: Alice, ID: 1001, Grade: 90
     * Name: Bob, ID: 1002, Grade: 85
     * Name: Charlie, ID: 1003, Grade: 80
     * Name: David, ID: 1004, Grade: 75
     * Name: Eve, ID: 1005, Grade: 70
     * Name: Frank, ID: 1006, Grade: 65
     * Name: Grace, ID: 1007, Grade: 60
     * Name: Heidi, ID: 1008, Grade: 55
     * Name: Ivan, ID: 1009, Grade: 50
     * Name: Judy, ID: 1010, Grade: 45
     * Name: Kevin, ID: 1011, Grade: 40
     * Name: Linda, ID: 1012, Grade: 35
     * Name: Michael, ID: 1013, Grade: 30
     * Name: Nancy, ID: 1014, Grade: 25
     * Name: Oliver, ID: 1015, Grade: 20
     * Name: Pamela, ID: 1016, Grade: 15
     * Name: Quincy, ID: 1017, Grade: 10
     * Name: Randy, ID: 1018, Grade: 5
     * Name: Samantha, ID: 1019, Grade: 0
     * Name: Trevor, ID: 1020, Grade: 100
     * Name: Ursula, ID: 1021, Grade: 95
     * Name: Victor, ID: 1022, Grade: 85
     * Name: Wendy, ID: 1023, Grade: 75
     * Name: Xander, ID: 1024, Grade: 65
     * Name: Yvonne, ID: 1025, Grade: 55
     * Name: Zach, ID: 1026, Grade: 45
     */

    ArrayList<String> studentList = new ArrayList<>();

    for (Student student : students) {
      studentList.add(student.name);
    }

    // for (String student : studentList) {
    //   System.out.println(student);
    // }

    long liststartTime = System.nanoTime();
    studentList.contains("Kevin");
    long listEndTime = System.nanoTime();
    System.out.println("Time taken to search for Kevin: " + (listEndTime - liststartTime) + " nanoseconds.");
    // Output: Time taken to search for Kevin: 3792 nanoseconds.

    TreeSet<Integer> gradeSet = new TreeSet<>((a, b) -> b - a);

    for (Student student : students) {
      gradeSet.add(student.grade);
    }

    for (Integer grade : gradeSet) {
      System.out.println("Grade: " + grade);
    }

    long treeStartTime = System.nanoTime();
    gradeSet.contains(40);
    long treeEndTime = System.nanoTime();
    System.out.println("Time taken to search for Kevin: " + (treeEndTime - treeStartTime) + " nanoseconds.");
    // Output: Time taken to search for Kevin: 2833 nanoseconds.

     HashMap<String, Integer> idMap = new HashMap<>();

    for (Student student : students) {
      idMap.put(student.name, student.id);
    }

    System.out.println("The student with ID 1001 is " + idMap.get(1001) + ".");
    // Output: The student with ID 1001 is Alice.

    long hashStartTime = System.nanoTime();
    idMap.containsKey("Kevin");
    long hashEndTime = System.nanoTime();
    System.out.println("Time taken to search for Kevin: " + (hashEndTime - hashStartTime) + " nanoseconds.");
    // Output: Time taken to search for Kevin: 1042 nanoseconds.
  }
}