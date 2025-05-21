/*

Write a Java program that creates an ArrayList to
store a list of students and their grades.
The program should provide the following functionality:

Add a student: The program should prompt the user for a
student name and their grade, and add the student to the ArrayList.

Remove a student: The program should prompt the user for
a student name and remove the corresponding entry from the ArrayList.

Search for a student: The program should prompt the
user for a student name and output their corresponding grade.
If the student name is not found in the ArrayList,
the program should output an error message.

Sort students by name: The program should sort the
ArrayList by student name in ascending order.

Sort students by grade: The program should sort the
ArrayList by student grade in descending order.

To accomplish these tasks, you can use the following Collections class methods:
addAll(collection, elements): Adds all elements from one collection to another.
sort(list): Sorts the elements in a list in natural order.
sort(list, comparator): Sorts the elements in a list using a custom comparator.
reverse(list): Reverses the order of the elements in a list.
You can also use the following ArrayList methods:
add(element): Adds an element to the end of the ArrayList.
remove(element): Removes the first occurrence of an element from the ArrayList.
get(index): Returns the element at the specified index in the ArrayList.
size(): Returns the number of elements in the ArrayList.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program233 {

    public static void main(String[] args) {

        ArrayList<Student6> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search for a student");
            System.out.println("4. Sort students by name");
            System.out.println("5. Sort students by grade");
            System.out.println("6. Display all students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter student grade: ");
                    int grade = sc.nextInt();

                    students.add(new Student6(name, grade));
                    System.out.println("Student added.");

                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = sc.nextLine();

                    boolean removed = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).getName().equalsIgnoreCase(nameToRemove)) {
                            students.remove(i);
                            System.out.println("Student removed.");
                            removed = true;
                            break;
                        }

                    }

                    if (!removed)
                        System.out.println("Student not found.");
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = sc.nextLine();

                    boolean found = false;

                    for (Student6 s : students) {
                        if (s.getName().equalsIgnoreCase(nameToSearch)) {
                            System.out.println("Grade: " + s.getGrade());
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");

                    break;

                case 4:
                    Collections.sort(students, Comparator.comparing(Student6::getName));

                    System.out.println("Students sorted by name.");
                    break;

                case 5:
                    Collections.sort(students, Comparator.comparing(Student6::getGrade).reversed());

                    System.out.println("Students sorted by grade.");
                    break;

                case 6:
                    System.out.println();

                    for (Student6 s : students) {
                        System.out.println("Name: " + s.getName() + ", Grade: " + s.getGrade());
                    }

                    System.out.println();
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

        }
        while (choice != 0);

    }
}



class Student6 {
    String name;
    int grade;

    public Student6(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

}