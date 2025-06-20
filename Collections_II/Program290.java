/*

Write a Java program that takes in a list of student
names and their grades from the user and stores them in a HashTable.
The program should then prompt the user for a student
name and output their grade.
If the student name is not found in the HashTable,
the program should output an error message.

*/

import java.util.*;

public class Program290 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hashtable<String, Character> grades = new Hashtable<>();

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter name " + i + ": ");
            String name = sc.next();

            System.out.println("Enter grade " + i + ": ");
            char grade = sc.next().charAt(0);

            grades.put(name, grade);

        }


        System.out.println("Enter name of student: ");
        String name = sc.next();

        if (grades.containsKey(name))
            System.out.println("Grade of " + name + " is " + grades.get(name));
        else
            throw new IllegalArgumentException("Student not found!");

    }

}