/*

WAP to concatenate two strings without using built in function.

*/

import java.util.*;

class Program483 {
    public static void main(String[] args) {


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = sc.nextLine();

        sc.nextLine();

        System.out.println("Enter the second String");
        String str2 = sc.nextLine();



        // concat
        String newStr = str1 + str2;

        System.out.println(newStr);


    }
}
