/*

Write a Java program to count digits of an integer
number given by user using class Digit and method
named counter without arguments without return.

*/

import java.util.*;

class Program543 {

    int number;

    public static void main(String[] args) {


        // Object
        Program543 p = new Program543();


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        p.number = sc.nextInt();

        p.counter();

    }


    void counter(){

        int digits = 0;

        while (number>0){
            number /= 10;
            digits++;
        }

        System.out.println("Count of digits is " + digits);

    }

}
