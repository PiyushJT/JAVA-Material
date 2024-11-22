/*

WAP to count the number of words in user given string sentence

*/

import java.util.*;

class Program484 {
    public static void main(String[] args) {


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();


        // Count of words
        int wordCount = 1;

        for (int i = 0; i <= str.length() - 1; i++) {

            if (str.charAt(i) == ' ') {
                wordCount++;
            }

        }

        System.out.println(wordCount);


    }
}