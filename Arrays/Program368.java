/*

Write a JAVA program read in an array of
integers and print its elements in reverse
order.

*/

import java.util.*;

class Program368 {

    public static void main(String[] args) {


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int len = sc.nextInt();

        System.out.println();

        // Take input for array
        int[] a = new int[len];
        for(int i = 0; i<len; i++){

            System.out.println("Enter value: ");
            a[i] = sc.nextInt();

        }

        System.out.println();


        // print in reverse
        for(int i = len-1; i >= 0; i--){

            System.out.println(a[i]);

        }

    }

}