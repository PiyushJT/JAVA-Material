/*

Write a java program to reverse elements of array using logic
of swapping elements. Here, use concept of passing array as argument to method

*/


import java.util.*;

class H18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){

            System.out.println("Enter element");
            arr[i] = sc.nextInt();

        }

        reverse(arr);
        show(arr);

    }

    static void reverse(int[] arr){

        System.out.println();

        for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }

    static void show(int[] arr){

        for(int val : arr)
            System.out.println(val);

    }

}