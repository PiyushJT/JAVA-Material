/*

Write a java program to calculate maximum and
minimum of five values. Pass input values as
constructor parameter.

*/

import java.util.Scanner;

class Program696 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++){

            System.out.println("Enter value");
            arr[i] = sc.nextInt();

        }

        Max m = new Max(arr);


    }

}

class Max{

    int[] arr;

    Max(int[] arr){

        int max = arr[0];
        int min = arr[0];


        for (int val : arr){

            if(max < val)
                max = val;

            if(min > val)
                min = val;

        }

        System.out.println("Max is " + max);
        System.out.println("Min is " + min);


    }

}