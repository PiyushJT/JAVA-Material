/*

Write a program to read the content of a file
into a character array and write it into
another file. Get names of the files from command line.

*/

import java.io.*;

public class Program350_356 {

    public static void main(String[] args) throws Exception {

        RandomAccessFile raf = new RandomAccessFile("input.txt", "r");
        byte[] bytes = new byte[12];
        raf.read(bytes, 8, 3);
        raf.close();
        System.out.println(new String(bytes));

    }

}