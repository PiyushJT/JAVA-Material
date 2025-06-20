/*

Write a program that reads in a list of words from the
user and stores them in a HashSet.
The program should then prompt the user for a prefix
and output all the words in the set that start with that prefix.

*/

import java.util.*;

public class Program286 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();

        System.out.println("Enter number of words to be stored: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter word " + i + ": ");
            set.add(sc.next());

        }

        System.out.println("Enter prefix: ");
        String prefix = sc.next();

        for (String word : set)
            if (word.startsWith(prefix))
                System.out.println(word);


    }

}