/*

WAP to count the occurance of the input character in a user input string.

*/

import java.util.*;

class Program485 {
    public static void main(String[] args) {


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        System.out.println("Enter the String");
        char ch = sc.next().charAt(0);


        // initial count
        int count = 0;


        // find ch by using loop and increment count where it is found
        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == ch)
                count++;

        }


        System.out.println(count);


    }
}
