/*

Write a program that reads in a list of words from a
file and stores them in a HashMap, along with their
frequency (i.e. how many times they appear in the file).
The program should then prompt the user for a word
and output the corresponding frequency, or a message
indicating that the word is not in the map.

*/

import java.util.*;
import java.io.*;

public class Program289 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        File file = new File("words.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        HashMap<String, Integer> map = new HashMap<>();

        String line = br.readLine();

        while (line != null) {

            if (map.containsKey(line))
                map.put(line, map.get(line) + 1);
            else
                map.put(line, 1);

            line = br.readLine();

        }

        System.out.println();
        System.out.println(map);
        System.out.println();

        System.out.println("Enter word: ");
        String word = sc.next();


        if (map.containsKey(word.toLowerCase()))
            System.out.println(map.get(word));
        else
            System.out.println("Word not available");


    }

}