/*

Write a Java program to calculate the power of a
number using method power(int number, int power)
E.g. power(2, 3) should return 8.

*/

import java.util.*;

class Program572	{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        int n = sc.nextInt();

        System.out.println("Enter power: ");
        int p = sc.nextInt();

        System.out.println(power(n, p));

    }

    static int power(int i,int j){

        if(j == 0)
            return 1;
        else
            return i * power(i, j-1);

    }

}