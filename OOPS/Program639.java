/*

Write a Java program to add 5 in original value of array elements and display
modified elements of one dimensional array using pass by value mechanism

*/

import java.util.*;

class Program639 {

    public static void main(String[] args) {

        int[] arr = {23,24,12,34,12};

        Demo3 ob = new Demo3();

        arr = ob.update(arr);


        // Printing
        for(int val : arr){

            System.out.println(val);

        }


    }

}

class Demo3{

    int[] update(int[] arr){

        int[] ar = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

            ar[i] = arr[i] + 5;

        }

        return ar;

    }
}