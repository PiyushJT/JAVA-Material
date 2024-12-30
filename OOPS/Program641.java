/*

Write a Java program to Swap two values,
which is given from user by using call by value.

*/

import java.util.*;

class Program641 {

    public static void main(String[] args) {

        Demo4 d = new Demo4();

        int a = 3;
        int b = 4;

        d.swap(a, b);

        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }
}

class Demo4{

    void swap(int a, int b){

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }
}