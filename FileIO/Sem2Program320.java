/*

Write a java program which read numbers from
number.txt file and store even number to
even.txt and odd number into odd.txt file

All external files are in DATA folder.

*/

import java.io.*;

public class Sem2Program320 {

    public static void main(String[] args) throws Exception {

        File numbers = new File("Data/numbers.txt");
        File even = new File("Data/even.txt");
        File odd = new File("Data/odd.txt");

        BufferedReader reader = new BufferedReader(new FileReader(numbers));
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter(even));
        BufferedWriter oddWriter = new BufferedWriter(new FileWriter(odd));

        String line = reader.readLine();
        while (line != null) {

            int num = Integer.parseInt(line);

            if (num % 2 == 0)
                evenWriter.write(num + "\n");
            else
                oddWriter.write(num + "\n");

            line = reader.readLine();

        }

        evenWriter.flush();
        oddWriter.flush();

        reader.close();
        evenWriter.close();
        oddWriter.close();
    }

}