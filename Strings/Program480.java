/*

WAP to reverse the each word of user given string sentence.

*/

import java.util.*;

class Program480 {

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str = sc.nextLine();


        // Count of words
        int wordCount = 1;

        for (int i = 0; i <= str.length() - 1; i++) {

            if (str.charAt(i) == ' ') {
                wordCount++;
            }

        }



        // Setting the word for loop
        String word = str + " ";  // " " at end so that last word is included

        // For every word
        for(int i = 1; i <= wordCount; i++){ // i from 1 to no of words

            // Reverse word
            String rev = "";

            // Length of first word
            int length = word
                    .substring(
                            0,
                            word.indexOf(' ')+1
                    )
                    .length();


            // Reversing every letter of the word
            for(int j = length-1; j >= 0; j--){ // j from end to 0

                rev = rev + word.charAt(j);

            }

            // Changing word (Removing previous word)
            word = word.substring(word.indexOf(' ') + 1);

            System.out.print(rev);

        }

    }
}