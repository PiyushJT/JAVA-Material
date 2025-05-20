/*

Write a Java program that creates an ArrayList<Student>
to store a name and marks of 3 students.
Then sort the ArrayList by student marks in descending order.
Then print arraylist using iterator.
Add these details of 3 Students in arraylist in given sequence:

Devarsh (18.5 marks), Viraj (20.5 marks) and Nidhi (17.5 marks)

Desired Output:
Name=Viraj, Marks=20.5
Name=Devarsh, Marks=18.5
Name=Nidhi, Marks=17.5

*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Program227 {

    public static void main(String[] args) {

        ArrayList<Student5> stud = new ArrayList<>();

        stud.add(new Student5("Devarsh", 18.5f));
        stud.add(new Student5("Viraj", 20.5f));
        stud.add(new Student5("Nidhi", 17.5f));

        System.out.println(stud);


        stud.sort(Comparator.comparing(Student5::getMarks).reversed());


        Iterator i = stud.iterator();

        while(i.hasNext())
            System.out.println(i.next());

    }

}


class Student5{

    String name;
    float marks;

    Student5(String name, float marks){
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return "Name = " + name + ", Marks = " + marks;
    }

    public float getMarks(){
        return marks;
    }

}