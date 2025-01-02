/*

WAP to find HCF of two numbers using recursion.

*/

import java.util.*;

class Program570_574 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter Number 2: ");
        int b = sc.nextInt();


        System.out.println("Hcf is " + hcf(a,b));
        System.out.println("Lcm is " + lcm(a,b));

    }

    static int hcf(int a, int b) {

        if (a % b == 0)
            return b;
        else
            return hcf(b, a % b);

    }

    static int lcm(int a, int b) {

        return a * b / hcf(a,b);

    }

}