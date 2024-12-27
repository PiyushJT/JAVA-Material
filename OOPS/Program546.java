/*

Write a Java program to check whether a number given
by user is Armstrong or not using class Ahmedabad and
method named armstrong with arguments with return

*/

import java.util.*;

class Program546 {

    public static void main(String[] args) {

        // Object
        Program546 p = new Program546();


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int number = sc.nextInt();

        System.out.println();
        System.out.println(p.armstrong(number));

    }

    boolean armstrong(int n){

        int temp1 = n, digits = 0, temp2 = n, sum = 0;


        // Digits
        while (temp1 > 0){
            digits++;
            temp1 /= 10;
        }


        while (temp2 > 0){

            int r = temp2 % 10;
            sum = sum + (int) Math.pow(r, digits);
            temp2 /= 10;

        }

        return sum == n;
    }
}