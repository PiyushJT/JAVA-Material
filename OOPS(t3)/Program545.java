/*

Write a Java program to check whether a given number
given by user is palindrome or not using class Gujarat
and method named palindrome with arguments without return

*/

import java.util.*;

class Program545 {

    public static void main(String[] args) {

        // Object
        Program545 p = new Program545();


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int number = sc.nextInt();

        p.palindrome(number);

    }

    void palindrome(int n){

        int temp = n, sum = 0;

        while (n>0){
            int r = n % 10;
            sum = sum*10 + r;
            n /= 10;
        }

        if(temp == sum)
            System.out.println("yes it is palindrome");
        else
            System.out.println("No it is not palindrome");

    }

}