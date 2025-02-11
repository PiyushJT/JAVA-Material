/*

WAP to accept three numbers from user and Print
Maximum number using nested if else.

*/


import java.util.*;

class E2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");
        float n1 = sc.nextFloat();

        System.out.println("Enter number 2");
        float n2 = sc.nextFloat();

        System.out.println("Enter number 3");
        float n3 = sc.nextFloat();


        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println(n1 + " is greatest");
            } else {
                System.out.println(n3 + " is greatest");
            }
        }
        else if(n2 > n3) {
            System.out.println(n2 + " is greatest");
        }
        else {
            System.out.println(n3 + " is greatest");
        }

    }

}