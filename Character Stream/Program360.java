/*

Write a program to display the bytes of a file in reverse sequence.
Provide the name of the file as a command line argument.

*/

import java.io.*;

public class Program360 {

    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter file name: ");
        String filename = "Data/" + br.readLine();
        filename = "Data/sample.txt";

        File file = new File(filename);

        FileInputStream fis = new FileInputStream(file);

        byte[] b = new byte[(int) file.length()];

        fis.read(b);

        for (int i = b.length-1; i >= 0; i--)
            System.out.println(b[i]);

    }

}