/*

Write a Java program that implements a HashTable to store a
dictionary of words and their definitions.
The program should prompt the user for a word and output its
definition. If the word is not found in the HashTable,
the program should ask the user if they would like to
add the word and its definition to the HashTable.
The program should use the following methods of the HashTable class:
put(K key, V value): Adds a key-value pair to the HashTable.
In this program, it should be used to add new words and their definitions.
get(Object key): Retrieves the value associated with the given key from
the HashTable. In this program, it should be used to retrieve the definition of a word.
containsKey(Object key): Returns true if the HashTable contains a
mapping for the specified key. In this program, it should be used
to check if a word is already in the HashTable.
keySet(): Returns a Set of all keys in the HashTable.
In this program, it should be used to print out a
list of all words in the dictionary.

*/

import java.util.*;

public class Program291 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hashtable<String, String> dictionary = new Hashtable<>();

        dictionary.put("apple", "a fruit that grows on trees");
        dictionary.put("dju", "its a biggest piece of ...t");
        dictionary.put("hello", "a greeting");
        dictionary.put("bye", "a farewell");
        dictionary.put("farewell", "used to express good feeling on parting.");

        System.out.println("Enter a word: ");
        String word = sc.next().toLowerCase();

        if (dictionary.containsKey(word))
            System.out.println("Definition: " + dictionary.get(word));

        else {
            System.out.println("Word not found!");

            System.out.println("Do you want to add it to the dictionary? (y/n)");
            char ch = sc.next().charAt(0);

            if (ch == 'y' || ch == 'Y') {
                System.out.println("Enter definition: ");
                String definition = sc.next();

                dictionary.put(word, definition);
                System.out.println("Word added to dictionary!");

            }
            else {
                System.out.println("Word not added to dictionary!");
            }

        }

        System.out.println("\n\n");
        System.out.println("Dictionary:");

        for (String key : dictionary.keySet())
            System.out.println(key + ": " + dictionary.get(key));

    }

}