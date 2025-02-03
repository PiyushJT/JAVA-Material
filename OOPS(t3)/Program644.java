/*

Write a Java program to copy one array
into another array using call by referrence

*/

import java.util.*;

class Program644 {

    public static void main(String[] args) {

        Demo6 d = new Demo6();

        int[] arr = {45,23,21,21,53,123};

        int[] arrCopy = d.copyArray(arr);


        for(int val : arrCopy){

            System.out.println(val);

        }

    }
}

class Demo6{

    int[] copyArray(int[] arr){

        int[] ar = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

            ar[i] = arr[i];

        }

        return ar;
    }
}