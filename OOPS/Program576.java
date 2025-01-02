/*

Declare array numArr = {7,32,64,2,10,23}
Find smallest element in this array using Recursion.
Output format : Smallest element in the array is: 2
(no need to display given array, no need of any user
input class like scanner)

*/

import java.util.*;

class Program576 {

    static int low;

    public static void main(String[] args){

        int[] arr = {7,32,64,2,10,23};
        low = arr[0];

        lowest(arr);

        System.out.println(low);

    }

    static void lowest(int[] arr){

        if(arr.length != 0){

            if(arr[0] < low)
                low = arr[0];


            int[] ar = new int[arr.length-1];

            for(int i = 1; i< arr.length; i++){

                ar[i-1] = arr[i];

            }

            lowest(ar);
        }

    }

}