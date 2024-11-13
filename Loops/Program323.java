/*

Write a Java Program to determine whether a
given number is a Disarium number or not?
(Hint: A number is said to be the Disarium
number when the sum of its digit raised to
the power of their respective positions is
equal to the number itself)
Eg: Input: 135 => 1^1 + 3^2 + 5^3 = 135 => 135
is a Disarium number. Input: 25 => 2^1 + 5^2 = 27 => 25
is not a Disarium number.

*/

import java.util.*;

class Program323 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int n1 = n;
        int n2 = n;

        int digits = 0, r = 0, sum = 0;


        // to get digits
        while(n1 > 0){

            n1 /= 10;
            digits++;

        }


        while(n2 > 0){

            r = n2 % 10;

            sum += (int) Math.pow(r,digits);
            digits--;

            n2 /= 10;

        }

        if (n == sum){
            System.out.println("It is a Disarium Number");
        }
        else{
            System.out.println("It is not a Disarium Number");
        }

    }
}