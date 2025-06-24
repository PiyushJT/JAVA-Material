/*

Write a java program to search the file named the
word entered as a filename from command line; if
it exists in the system then program should
print the content of a file on console.

*/

import java.io.*;

public class Program351_355 {

    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter file name: ");
        String name = "Data/" + br.readLine();

        File file = new File(name);

        if (file.exists()) {

            BufferedReader bR = new BufferedReader(new FileReader(file));

            String line = bR.readLine();
            while (line != null) {
                System.out.println(line);
                line = bR.readLine();
            }

        }

        else {
            System.out.println("File not found in the system");
        }

    }

}