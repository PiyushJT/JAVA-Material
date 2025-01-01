/*

Write a program to calculate factorial using recursion in Java

*/

import java.util.*;

class Program571 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int a = sc.nextInt();

        System.out.println(fact(a));

    }

    static int fact(int a) {

        if (a == 0)
            return 1;
        else
            return a * fact(a-1);

    }

}