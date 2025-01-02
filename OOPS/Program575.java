/*

Write a Java program to print fibbonacci series
upto n terms using recursion

*/

import java.util.*;

class Program575 {

    static int a = 0, b = 1;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        int n = sc.nextInt() ;


        if(n > 1){

            System.out.print(a + " ");
            System.out.print(b + " ");
            fib(n-2);
        }

        else
            System.out.print("Enter valid number! ");
    }

    static void fib(int i){

        if(i != 0){
            int c = a+b;
            a = b;
            b = c;

            System.out.print(c + " ");
            fib(i-1);
        }

    }

}