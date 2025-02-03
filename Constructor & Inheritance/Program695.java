/*

create  a  default  constructor  which  is  used
to  display  the  initialized  attributes
(first name,last name & age) in the Student object.

*/

import java.util.Scanner;

class Program695 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter last name");
        String lastName = sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();

        Person p = new Person(name, lastName, age);

    }

}

class Person{

    String name;
    String lastName;
    int age;


    Person(String name, String lastName, int age){

        this.name = name;
        this.lastName = lastName;
        this.age = age;

        System.out.println(this.name);
        System.out.println(this.lastName);
        System.out.println(this.age);

    }

}