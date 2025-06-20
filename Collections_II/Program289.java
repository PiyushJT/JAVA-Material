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

        File file = new File("words.txt");

        FileReader fr = new FileReader(file);

        fr.read();

    }

}