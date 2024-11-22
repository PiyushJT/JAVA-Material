/*

WAP to reverse the input string.

*/

import java.util.*;

class Program482 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();


        // Defining a reverse string
        String rev = "";


        // Traversing in reverse order to make it reverse
        for(int i = str.length() -1; i >= 0; i--){

            rev = rev + str.charAt(i);

        }

        System.out.println(rev);

    }
}
