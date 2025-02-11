/*

Write JAVA program to add two 1-D array elements in third 1-D array.

*/


import java.util.*;

class E20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of Array: ");
        int len = sc.nextInt();

        System.out.println();


        int[] a = new int[len];
        for(int i = 0; i<len; i++){

            System.out.println("Enter value: ");
            a[i] = sc.nextInt();

        }


        int[] b = new int[len];
        for(int i = 0; i<len; i++){

            System.out.println("Enter value for b: ");
            b[i] = sc.nextInt();

        }


        int[] c = new int[len];

        for(int i = 0; i < len; i++){

            c[i] = a[i] + b[i];

        }


        for(int i = 0; i < len; i++){

            System.out.println(c[i]);

        }


    }
}