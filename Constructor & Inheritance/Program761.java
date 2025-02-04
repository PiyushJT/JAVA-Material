/*

Write a java program to check if given number is
prime or not using static inner class concept.

*/

import java.util.Scanner;

class Program761 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        Parent5 p = new Parent5();

        Parent5.Child5.prime(num);


    }

}


class Parent5 {

    static class Child5 {

        static void prime(int a) {

            for (int i = 2; i < a; i++) {

                if (a % i == 0) {

                    System.out.println("not prime");
                    return;

                }

            }
            System.out.println("It is prime");

        }

    }

}