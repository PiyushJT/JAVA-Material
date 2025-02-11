/*

Write a program that creates an integer array and then uses a
for loop to check whether the array is sorted from smallest to largest.
If so, it prints “sorted” otherwise it prints “Not sorted”.
Use Class, object & method.

*/


import java.util.*;

class H2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++){

            System.out.println("Enter value: ");
            arr[i] = sc.nextInt();

        }

        Sort s = new Sort(arr);

        System.out.println("Is sorted: " + s.isSorted());


    }
}

class Sort{
    int[] arr;

    Sort(int[] arr){
        this.arr = arr;
    }

    boolean isSorted(){

        for(int i = 0; i < arr.length-1; i++){

            if(arr[i] > arr[i+1])
                return false;

        }

        return true;
    }

}