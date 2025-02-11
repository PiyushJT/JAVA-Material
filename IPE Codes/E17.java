/*

WAP to swap two numbers without using temporary variable.

*/


import java.util.*;

class E17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numbers");
        int a = sc.nextInt();

        System.out.println("Enter another number");
        int b = sc.nextInt();


        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}