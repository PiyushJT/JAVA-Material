/*

WAP to reverse a number

*/

import java.util.*;

class Program322 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sum = 0;

        for(int r = 0; n > 0;){

            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;

        }

        System.out.println("Reverse of the number is " + sum);

    }
}
