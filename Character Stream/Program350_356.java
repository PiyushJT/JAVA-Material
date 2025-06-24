/*

Write a program to read the content of a file
into a character array and write it into
another file. Get names of the files from command line.

*/

import java.io.*;

public class Program350_356 {

    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter src file");
        String src = "Data/" + br.readLine();
        src = "Data/src.txt";

        System.out.println("Enter dest file");
        String dest = "Data/" + br.readLine();
        dest = "Data/dest.txt";


        File srcFile = new File(src);
        File destFile = new File(dest);

        BufferedReader reader = new BufferedReader(new FileReader(srcFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));

        char[] ch = new char[(int) srcFile.length()];

        reader.read(ch);

        writer.write(ch);

        reader.close();
        writer.close();

    }

}