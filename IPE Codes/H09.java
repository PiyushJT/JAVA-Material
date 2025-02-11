/*

Write a Java program to convert Decimal to binary using recursion

*/


import java.util.*;

class H09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
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