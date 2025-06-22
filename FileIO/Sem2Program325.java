/*

Write a program that reads file name from user,
through command line argument and displays/reads
content of the text file on console.

All external files are in DATA folder.

*/

import java.io.*;

public class Sem2Program325 {

    public static void main(String[] args) throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter name: ");
        String name = "Data/" + br.readLine();

        File file = new File(name);

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line = reader.readLine();

        while (line != null) {

            System.out.println(line);

            line = reader.readLine();

        }

        reader.close();
    }

}