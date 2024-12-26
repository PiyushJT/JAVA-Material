/*

Write a Java program to find product of all digits
of an integer number  given by user using class India
and method named product without arguments with return.

*/

import java.util.*;

class Program544 {

    int number;

    public static void main(String[] args) {


        // Object
        Program544 p = new Program544();


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        p.number = sc.nextInt();

        System.out.println(p.product());

    }

    int product(){

        int prod = 1;

        while (number>0){
            int r = number % 10;
            number /= 10;
            prod *= r;
        }

        return prod;

    }


}