/*

Write a program to sort the one file numbers to another.
for example one file contain the unsorted number
separated by line and write the another filr with sorted number.

*/

import java.io.*;
import java.util.*;

public class Program361 {

    public static void main(String[] args) throws Exception {


        // Two files
        File readFile = new File("Data/unsortedNumbers.txt");
        File writeFile = new File("Data/sortedNumbers.txt");


        // Declaring readers and writers
        BufferedReader reader = new BufferedReader(new FileReader(readFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(writeFile));

        // declaring arrayList for sorting
        ArrayList<Integer> arr = new ArrayList<>();

        // adding values to arrayList
        String line = reader.readLine();
        while (line != null) {

            arr.add(Integer.parseInt(line));
            line = reader.readLine();
        }

        // sorting the list
        Collections.sort(arr);


        // iterating the list and writing into another file
        Iterator i = arr.iterator();
        while (i.hasNext())
            writer.write(i.next().toString() + "\n");


        writer.flush();

        reader.close();
        writer.close();

    }

}