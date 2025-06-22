/*

Write a program to create a new file and write the
number into it and sort that file content into different file.

*/

import java.io.*;
import java.util.*;

public class Sem2Program328 {

    public static void main(String[] args) throws Exception {

        // Two files
        File readFile = new File("Data/unsortedNumbers.txt");
        File writeFile = new File("Data/sortedNumbers.txt");

        // create the base file
        if (!readFile.exists())
            readFile.createNewFile();


        // Declaring readers and writers
        BufferedReader reader = new BufferedReader(new FileReader(readFile));
        BufferedWriter readWriter = new BufferedWriter(new FileWriter(readFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(writeFile));

        // writing random numbers in base file
        for (int i = 1; i <= 10; i++) {

            int num = (int) (Math.random() * 1000);
            readWriter.write(num + "\n");
            readWriter.flush();

        }


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