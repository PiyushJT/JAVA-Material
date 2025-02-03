/*

Write a Java program to get cube of given number using static method.

*/

import java.util.Scanner;

class Program734 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value");
        int val = sc.nextInt();

        cube(val);


    }
    static void cube(int val){

        System.out.println(val*val*val);

    }

}