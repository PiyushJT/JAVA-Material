/*

Write a program that performs the following task:
1. Create a file named “Data1.txt” and write the
numbers 100,200,300, 400 and 500 each on separate line.
2. Read the data from “Data1.txt” and calculate the sum of all the numbers.

*/

import java.io.*;

public class Sem2Program363 {

    public static void main(String[] args) throws Exception {

        File file = new File("Data/Data1.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        bw.write("100");
        bw.newLine();
        bw.write("200");
        bw.newLine();
        bw.write("300");
        bw.newLine();
        bw.write("400");
        bw.newLine();
        bw.write("500");

        bw.close();


        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        int sum = 0;

        while (line != null) {

            sum += Integer.parseInt(line);

            line = br.readLine();
        }

        System.out.println(sum);

        br.close();

    }

}
