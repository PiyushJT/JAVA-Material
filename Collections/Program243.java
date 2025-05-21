/*

Write a Java program to sort a stack of Student objects by their GPA.
You need to implement a function that takes a stack of Student objects
as input and returns a new stack with the Students sorted in descending order of their GPA.
To solve this problem, you can create a Student class with attributes
such as name, id, and GPA. You can then create a stack of Student objects
and implement a function to sort the stack by their GPA.

*/

import java.util.Comparator;
import java.util.Stack;

public class Program243 {

    public static void main(String[] args) {

        Stack<Student7> students = new Stack<>();

        students.add(new Student7("Dilip", 01, -999999));
        students.add(new Student7("My Crush", 02, 10));

        System.out.println(sort(students));

    }


    static Stack<Student7> sort(Stack<Student7> students){

        students.sort(Comparator.comparing(Student7::getGPA).reversed());

        return students;

    }

}


class Student7{

    String name;
    int id;
    float GPA;

    public Student7(String name, int id, float GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }

    public float getGPA() {
        return GPA;
    }

    public String toString(){
        return "name = " + name + " GPA = " + GPA;
    }

}