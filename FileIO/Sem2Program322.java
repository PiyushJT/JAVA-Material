/*

Write a program that counts the no. of words
in a text file. The file name is passed as
a command line argument. The program should
check whether the file exists or not.
The words in the file are separated
by white space characters

All external files are in DATA folder.

*/

import java.io.*;

public class Sem2Program322 {

    public static void main(String[] args) throws Exception {

        String filename;
        // filename= "Data/" + args[0];
        filename = "Data/text.txt";

        File file = new File(filename);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        int count = 0;

        while (line != null) {

            String[] words = line.split(" ");
            count += words.length;

            line = br.readLine();

        }

        br.close();

        System.out.println("Total words: " + count);

    }

}