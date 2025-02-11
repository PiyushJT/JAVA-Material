/*

WAP to count ODD and EVEN numbers from given 10 numbers.

*/


import java.util.*;

class E5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];


        for(int i = 0; i < 10; i++){

            System.out.println("Enter the number " + (i+1) + ":");
            arr[i] = sc.nextInt();

        }



        System.out.println();
        System.out.println();

        for(int val : arr){

            if(val % 2 == 0){
                System.out.println(val + " is Even");
            }
            else {
                System.out.println(val + " is Odd");
            }

        }

        System.out.println();

    }

}