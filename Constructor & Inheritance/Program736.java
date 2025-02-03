/*

Write a Java program to find factorial of given
number using static method.

*/

import java.util.Scanner;

class Program736 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value");
        int val = sc.nextInt();

        fact(val);


    }

    static void fact(int a){

        int fact = 1;
        for (int i = 1; i <= a; i++) {

            fact *= i;

        }

        System.out.println(fact);

    }

}