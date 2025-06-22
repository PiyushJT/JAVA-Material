/*

Write a program to find the sum of all the number in
Number.txt file and print the result in console.

*/

import java.io.*;

public class Sem2Program327 {

    public static void main(String[] args) throws Exception {

        File numbers = new File("Data/numbers.txt");

        BufferedReader br = new BufferedReader(new FileReader(numbers));

        String line = br.readLine();

        int sum = 0;

        while (line != null) {

            int num = Integer.parseInt(line);
            sum += num;

            line = br.readLine();

        }

        System.out.println("Sum is " + sum);

    }

}