/*

Write a program to replace all “word1” by “word2” to a
file without using temporary file and display the no. of replacement.

*/

import java.io.*;

public class Program358 {

    public static void main(String[] args) throws Exception {

        File file = new File("Data/sample2.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));


        String data = "";

        String line = br.readLine();
        while (line != null) {
            data += line + "\n";
            line = br.readLine();
        }
        data = data.substring(0, data.length()-1);

        br.close();

        // Now file data is stored in String data.

        br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        System.out.println("Enter word 1: ");
        String w1 = br.readLine().toLowerCase();

        System.out.println("Enter word 2: ");
        String w2 = br.readLine();

        String[] words = data.toLowerCase().split("\\s+");

        int count = 0;
        for (String w : words) {
            if (w.equals(w1)) {
                count++;
            }
        }

        System.out.println("Changed " + count + " times.");

        data = data.replaceAll(w1, w2);

        bw.write(data.toCharArray());

        bw.close();

    }

}