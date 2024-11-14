/*

WAP to find result of 1+3/5+5/7+7/9+... series.
Print addition of first N part

*/

import java.util.*;

class Program321 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        double sum = 1, a = 3, b = 5;

        for(int i = 1; i < n; i++){

            sum += a/b;

            a += 2;
            b += 2;

        }

        System.out.println("The sum is " + sum);

    }

}