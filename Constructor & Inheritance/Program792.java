/*

Write a Java program to implement single inheritance between class Subject &
Java.
Class java is a child class of class Subject. Class Java has a method called
displayMarks() and class Subject has a method called display ().
Show usage of single inheritance in Java with above classes

*/

class Program792 {

    public static void main(String[] args) {

        Subject s = new Subject();
        s.display();


        Java j = new Java();
        j.display();
        j.displayMarks();


    }

}

class Subject{

    void display(){

        System.out.println("Subject's marks");

    }

}


class Java extends Subject{


    void displayMarks(){

        System.out.println("Java's marks");

    }

}