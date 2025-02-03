/*

Write a Java program to convert Decimal number to Binary number using recursion

 2|9|1
 2|4|0
 2|2|0
 2|1|1
  |0|

*/

import java.util.*;

class Program573	{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        int n = sc.nextInt();

        System.out.println(toBinary(n));

    }

    static int toBinary(int i){

        if(i == 0)
            return 0;
        else
            return i % 2 + 10 * toBinary(i/2);

    }

}